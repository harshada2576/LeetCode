/*
class Solution {
    public int rob(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        while(c < nums.length){
            int s=0;
            for(int i=c ; i<nums.length; i=i+2){
                 s=s+nums[i];
            }
            max=Math.max(s,max);
            c++;
        }
    return max;
    }
}
*/


class Solution {
    public int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int money : nums) {

            int robCurrent = money + prev2;
            int skipCurrent = prev1;

            int current = Math.max(robCurrent, skipCurrent);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}