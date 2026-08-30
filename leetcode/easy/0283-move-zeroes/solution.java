class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[i] == 0 || nums[j] == 0 && i !=j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}