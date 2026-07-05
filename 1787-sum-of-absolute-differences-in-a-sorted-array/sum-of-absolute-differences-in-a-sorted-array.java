class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Build prefix sum array
        int[] prefixSums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            int leftSum = prefixSums[i]; 
            int leftTotal = i * nums[i]; 
            
            int rightSum = prefixSums[n] - prefixSums[i + 1]; 
            int rightTotal = (n - 1 - i) * nums[i];
            
            int leftAbsoluteDiff = Math.abs(leftTotal - leftSum);
            int rightAbsoluteDiff = Math.abs(rightSum - rightTotal);
            
            result[i] = leftAbsoluteDiff + rightAbsoluteDiff;
        }
        
        return result;
    }
}
