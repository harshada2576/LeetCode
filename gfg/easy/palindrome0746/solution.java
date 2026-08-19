class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            n = -n;
        }

        int original = n;
        long reversed = 0; while (n > 0) {
            reversed = (reversed * 10) + (n % 10);
            n /= 10;
        }

        return original == reversed;
    }
}