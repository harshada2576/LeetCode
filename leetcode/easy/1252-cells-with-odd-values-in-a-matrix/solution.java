class Solution {

    int[][] rowadd(int k, int n, int[][] ans) {
        int i = k, j = 0;

        while (j < n) {
            ans[i][j]++;
            j++;
        }

        return ans;
    }

    int[][] coladd(int k, int m, int[][] ans) {
        int i = 0, j = k;

        while (i < m) {
            ans[i][j]++;
            i++;
        }

        return ans;
    }

    int odd(int[][] ans, int m, int n) {
        int c = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    c++;
                }
            }
        }

        return c;
    }

    public int oddCells(int m, int n, int[][] indices) {

        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            rowadd(indices[i][0], n, ans);
            coladd(indices[i][1], m, ans);
        }

        return odd(ans, m, n);
    }
}