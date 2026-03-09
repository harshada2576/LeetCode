import java.util.*;

class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        Arrays.sort(nums);  // sort first
        int count = 1;

        for (int i = 1; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (isPrime(count)) return true;
                count = 1; // reset for next number
            }
        }
        return false;
    }
}
