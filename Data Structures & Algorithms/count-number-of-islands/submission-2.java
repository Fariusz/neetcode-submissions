class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    bfs(grid, i, j);
                }
            }
        }

        return islands;
    }

    private void bfs(char[][] grid, int i, int j) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {i, j});
        grid[i][j] = 0;
        int size = q.size();

        int[][] directions = {
            {0, 1}, // prawo
            {0, -1}, // lewo
            {1, 0}, // dół
            {-1, 0} // góra
        };

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int row = current[0];
            int col = current[1];

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                boolean isInsideGrid =
                    newRow >= 0 && 
                    newRow < grid.length && 
                    newCol >= 0 && 
                    newCol < grid[0].length;

                if (isInsideGrid) {
                    if (grid[newRow][newCol] == '1'){
                        grid[newRow][newCol] = '0';
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }
    }
}
