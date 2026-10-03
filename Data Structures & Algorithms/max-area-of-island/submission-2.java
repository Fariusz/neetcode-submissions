class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int area = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    area = bfs(grid, i, j, area);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                    area = 1;
                }
            }
        }

        return maxArea;
    }

    private int bfs(int[][] grid, int i, int j, int area) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {i, j});
        int size = q.size();

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!q.isEmpty()) {
            int[] coordinates = q.poll();
            int row = coordinates[0];
            int col = coordinates[1];

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                grid[row][col] = 0;

                if (newRow < grid.length && newCol < grid[0].length && newRow >= 0 && newCol >= 0
                    && grid[newRow][newCol] == 1) {
                    q.offer(new int[] {newRow, newCol});
                    grid[newRow][newCol] = 0;

                    area++;
                }
            }
        }

        return area;
    }
}