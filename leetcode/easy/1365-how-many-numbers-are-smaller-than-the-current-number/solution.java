class Solution {
    int small(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n != i && arr[i] < arr[n])
                count++;
        }
        return count;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = small(i, nums);
        }
        return ans;
    }
}