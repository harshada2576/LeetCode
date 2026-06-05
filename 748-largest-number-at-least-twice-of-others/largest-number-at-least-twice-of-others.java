import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int max = Arrays.stream(nums).max().getAsInt();
        int maxIndex = -1;

        // Find index of max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                maxIndex = i;
                break;
            }
        }

        // Check condition: max >= 2 * every other number
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
