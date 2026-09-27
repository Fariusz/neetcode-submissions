class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        // Puste drzewo ma wysokość 0
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);

        // Lewe poddrzewo jest niezbalansowane
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = height(node.right);

        // Prawe poddrzewo jest niezbalansowane
        if (rightHeight == -1) {
            return -1;
        }

        // Aktualny węzeł jest niezbalansowany
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Wysokość aktualnego drzewa
        return 1 + Math.max(leftHeight, rightHeight);
    }
}