class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int temp;
        int i=0;int j=0;
        while(j<nums.length)
        {
            if(nums[j]%2==0)
            {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
                j++;
        }
    return nums;   
    }
}