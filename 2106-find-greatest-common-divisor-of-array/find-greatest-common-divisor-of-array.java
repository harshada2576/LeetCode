class Solution {
      int getGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        //int max=nums[nums.length-1];
        //int min=nums[0];
        return getGCD(nums[nums.length-1],nums[0]);
        
    }
}