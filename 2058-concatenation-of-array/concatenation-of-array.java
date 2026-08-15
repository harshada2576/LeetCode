class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int[] ans = new int[2*nums.length];
        int i=0;
        int j=ans.length-nums.length;
        while(i<nums.length)
        {
            ans[i]=nums[i];
            ans[j]=nums[i];
            i++;
            j++;
        }
    return ans;    
    }
}