class Solution {
    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Node newNode = new Node(node.val);

        visited.put(node, newNode);

        dfs(node.neighbors, newNode.neighbors);

        return newNode;
    }

    private void dfs(List<Node> nodeList, List<Node> newNodeList) {

        for (Node node : nodeList) {

            if (visited.containsKey(node)) {
                newNodeList.add(visited.get(node));
                continue;
            }
            
            Node newNode = new Node(node.val);

            visited.put(node, newNode);
            newNodeList.add(newNode);

            dfs(node.neighbors, newNode.neighbors);
        }
    }
}