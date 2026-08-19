class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int maxVal = 0;
        for (int num : arr) {
            maxVal = Math.max(maxVal, num);
        }

        boolean[] exists = new boolean[maxVal + 1];
        for (int num : arr) {
            exists[num] = true;
        }

        for (int a = 1; a <= maxVal; a++) {
            if (!exists[a]) continue;

            for (int b = a + 1; b <= maxVal; b++) {
                if (!exists[b]) continue;

                int sumSquare = (a * a) + (b * b);
                int c = (int) Math.sqrt(sumSquare);

                if (c * c == sumSquare && c <= maxVal && exists[c]) {
                    return true;
                }
            }
        }

        return false;
    }
}