/*
class Solution {
    public boolean canJump(int[] nums) {
      int i=0, index=0;
      while(i < nums.length){
            index=index + nums[i];
            i++;
      } 
      return index >= nums.length;
    }
}
*/
class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // We cannot even reach this position
            if (i > maxReach) {
                return false;
            }

            // Update the farthest position we can reach
            maxReach = Math.max(maxReach, i + nums[i]);

            // We can already reach the last index
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}