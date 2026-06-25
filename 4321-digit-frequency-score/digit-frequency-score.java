class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        int num = Math.abs(n);

        // Handle the case when n = 0
        if (num == 0) {
            freq[0] = 1;
        }

        // Count frequency of each digit
        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }

        int score = 0;

        // Calculate score
        for (int d = 0; d <= 9; d++) {
            score += d * freq[d];
        }

        return score;
    }
}