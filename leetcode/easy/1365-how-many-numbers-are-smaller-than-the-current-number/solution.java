class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Step 1: Count frequency of each number (0 to 100)
        int[] count = new int[102];
        for (int num : nums) {
            count[num]++;
        }
        
        // Step 2: Calculate running sum (prefix sums)
        // count[i] will store how many numbers are smaller than or equal to i
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        
        // Step 3: Build the answer array
        // count[num - 1] gives the exact count of strictly smaller numbers
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = count[nums[i] - 1];
            }
        }
        
        return ans;
    }
}