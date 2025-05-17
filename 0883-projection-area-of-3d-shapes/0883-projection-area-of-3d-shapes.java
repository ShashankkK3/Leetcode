class Solution {
        public int projectionArea(int[][] grid) {
        int z = 0, x = 0, y = 0;
        for (int[] row : grid)
            y += Arrays.stream(row).max().getAsInt();
        for (int j = 0; j < grid[0].length; ++j) {
            int mx = 0;
            for (int i = 0; i < grid.length; ++i) {
                mx = Math.max(mx, grid[i][j]);
                if (grid[i][j] > 0) { ++z; }
            }
            x += mx;
        }
        return x + y + z;
    }
}