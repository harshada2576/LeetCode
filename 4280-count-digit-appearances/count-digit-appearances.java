class Solution 
{
    int countdigitnum(int n,int digit)
    {
        int c=0;
        while(n>0)
        {
           int r=n%10;
            n=n/10;
            if(r==digit)
                c++;
        }
        return c;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            c=c+countdigitnum(nums[i],digit);
        }
        return c;
    }
}