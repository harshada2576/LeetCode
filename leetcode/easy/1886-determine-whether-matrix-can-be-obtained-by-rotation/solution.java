import java.util.Arrays;

class Solution {

    int[][] rotate(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = mat[i][j];

                mat[i][j] = mat[n - 1 - j][i];

                mat[n - 1 - j][i] =
                    mat[n - 1 - i][n - 1 - j];

                mat[n - 1 - i][n - 1 - j] =
                    mat[j][n - 1 - i];

                mat[j][n - 1 - i] = temp;
            }
        }

        return mat;
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int c = 0; c < 4; c++) {

            if (Arrays.deepEquals(mat, target))
                return true;

            rotate(mat);
        }

        return false;
    }
}