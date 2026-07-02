class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            // If the remainder is 2, it requires a duplicate power of 3
            if (n % 3 == 2) {
                return false;
            }
            // Move to the next base-3 digit
            n /= 3;
        }
        return true;
    }
}
