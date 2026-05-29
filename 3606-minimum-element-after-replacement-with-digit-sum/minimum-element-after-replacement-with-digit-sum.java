class Solution 
{
    int min=Integer.MAX_VALUE;
    int ds(int n)
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+r;
        }
        return s;
    }
    public int minElement(int[] nums) 
    {
        
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=ds(nums[i]);
            min=nums[i]>min?min:nums[i];
        }
    return min;    
    }
}