class Solution {
    public int projectionArea(int[][] grid) {
        int totalArea = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            int maxRow = 0; // Tracks the max height in row i (Side View)
            int maxCol = 0; // Tracks the max height in column i (Front View)
            
            for (int j = 0; j < n; j++) {
                // 1. Top View (XY Plane): Every non-empty cell adds 1
                if (grid[i][j] > 0) {
                    totalArea++;
                }
                
                // 2. Side View (YZ Plane): Find max of row i
                if (grid[i][j] > maxRow) {
                    maxRow = grid[i][j];
                }
                
                // 3. Front View (ZX Plane): Find max of column i 
                // (By swapping coordinates to grid[j][i], we check column i)
                if (grid[j][i] > maxCol) {
                    maxCol = grid[j][i];
                }
            }
            
            // Add the maximums found for this row and column
            totalArea += maxRow + maxCol;
        }

        return totalArea;
    }
}
