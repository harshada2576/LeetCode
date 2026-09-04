class Solution {
    int max(int i, int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int j = 0; j <= i; j++) {
            if (nums[j] > max)
                max = nums[j];
        }

        return max;
    }

    int min(int i, int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int j = i; j <= nums.length - 1; j++) {
            if (nums[j] < min)
                min = nums[j];
        }

        return min;
    }

    public int firstStableIndex(int[] nums, int k) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max(i, nums) - min(i, nums) <= k) {
                return i;
            }
        }

        return -1;
    }
}