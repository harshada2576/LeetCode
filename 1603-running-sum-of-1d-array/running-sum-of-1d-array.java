class Solution 
{
    int rs(int[] nums, int i)
    {
        int sum=0;
        for(int j=0; j<=i; j++)
            sum=sum+nums[j];
        return sum;
    }
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        for(int i=0; i<nums.length; i++)
            runningSum[i]+=rs(nums,i);
        return runningSum;
        
    }
}