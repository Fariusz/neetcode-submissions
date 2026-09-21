class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = 0;

        while (row < matrix.length && matrix[row][col] < target) {
            row++;
        }

        if (row == matrix.length) {
            row--;
        }

        if (matrix[row][col] > target && row > 0) {
            row--;
        }

        while (col < matrix[row].length && matrix[row][col] < target) {
            col++;
        }

        if (col == matrix[row].length) {
            return false;
        }

        return matrix[row][col] == target;
    }
}