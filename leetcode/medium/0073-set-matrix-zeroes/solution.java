class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Find original zeroes
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (matrix[r][c] == 0) {
                    zeroRows[r] = true;
                    zeroCols[c] = true;
                }
            }
        }

        // Set rows to zero
        for (int r = 0; r < rows; r++) {
            if (zeroRows[r]) {
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        // Set columns to zero
        for (int c = 0; c < cols; c++) {
            if (zeroCols[c]) {
                for (int r = 0; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}