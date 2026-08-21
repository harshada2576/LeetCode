class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101]; // Constraints: 1 <= nums[i] <= 100
        int pairs = 0;
        
        for (int num : nums) {
            pairs += count[num]; // Add existing count to total pairs
            count[num]++;        // Increment count for current number
        }
        
        return pairs;
    }
}