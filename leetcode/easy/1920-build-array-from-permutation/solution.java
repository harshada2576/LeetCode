class Solution {
    public int[] buildArray(int[] nums) {
        int mask = 1023; // 2^10 - 1 (10 bits set to 1)
        
        // Step 1: Encode new value into higher 10 bits
        for (int i = 0; i < nums.length; i++) {
            int newValue = nums[nums[i]] & mask;
            nums[i] |= (newValue << 10);
        }
        
        // Step 2: Shift right by 10 to leave only the new values
        for (int i = 0; i < nums.length; i++) {
            nums[i] >>= 10;
        }
        
        return nums;
    }
}