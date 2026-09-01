class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find minimum in each row
        int[] rowMin = new int[rows];

        for (int i = 0; i < rows; i++) {
            rowMin[i] = Integer.MAX_VALUE;

            for (int j = 0; j < cols; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        // Find maximum in each column
        int[] colMax = new int[cols];

        for (int j = 0; j < cols; j++) {
            colMax[j] = Integer.MIN_VALUE;

            for (int i = 0; i < rows; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Check which elements are both row minimum and column maximum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == rowMin[i] &&
                    matrix[i][j] == colMax[j]) {

                    lucky.add(matrix[i][j]);
                }
            }
        }

        return lucky;
    }
}
