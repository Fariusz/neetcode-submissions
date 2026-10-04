class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();
        Map<Node, Node> copies = new HashMap<>();

        // Tworzymy kopię pierwszego węzła
        copies.put(node, new Node(node.val));
        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Node neighbor : current.neighbors) {

                // Jeżeli kopia sąsiada jeszcze nie istnieje, tworzymy ją
                if (!copies.containsKey(neighbor)) {
                    copies.put(neighbor, new Node(neighbor.val));
                }

                // Łączymy kopię current z kopią neighbor
                copies.get(current).neighbors.add(copies.get(neighbor));

                // Dodajemy oryginalnego sąsiada do BFS tylko raz
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        return copies.get(node);
    }
}