class Solution {
    int count = 0;

    public int islandPerimeter(int[][] grid) {
        Set<Pair<Integer, Integer>> visited = new HashSet<>();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    dfs(grid, row, col, visited);
                    return count;
                }
            }
        }

        return 0;
    }

    private void dfs(
        int[][] grid,
        int row,
        int col,
        Set<Pair<Integer, Integer>> visited
    ) {
        // Wyjście poza macierz oznacza granicę wyspy
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            count++;
            return;
        }

        // Wejście na wodę oznacza granicę wyspy
        if (grid[row][col] == 0) {
            count++;
            return;
        }

        Pair<Integer, Integer> position = new Pair<>(row, col);

        // Tego fragmentu wyspy nie przetwarzamy ponownie
        if (visited.contains(position)) {
            return;
        }

        visited.add(position);

        dfs(grid, row + 1, col, visited);
        dfs(grid, row - 1, col, visited);
        dfs(grid, row, col + 1, visited);
        dfs(grid, row, col - 1, visited);
    }
}