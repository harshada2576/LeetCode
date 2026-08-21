class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int [2*n];
        int i=0;
        int j=n;
        for(int k=0; k<ans.length; k++){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[j];
            i++;
            j++;
        }    
    return ans;
    }
}