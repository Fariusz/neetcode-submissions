class Solution {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> q = new ArrayDeque<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return result;
    }

    private void dfs(TreeNode current) {
        while (current != null || !q.isEmpty()) {
            // 1. Zejdź maksymalnie w LEWO
            while (current != null) {
                q.push(current);
                current = current.left;
            }

            // 2. Teraz możemy przetworzyć ROOT
            current = q.pop();
            result.add(current.val);

            // 3. Przejdź do RIGHT
            current = current.right;
        }
    }
}