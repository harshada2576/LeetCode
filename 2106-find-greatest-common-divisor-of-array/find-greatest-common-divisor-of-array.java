class Solution {
      int getGCD(int a, int b) {
    if (b == 0) {
        return a;
    }
    return getGCD(b, a % b);
}
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        return getGCD(min,max);
        
    }
}