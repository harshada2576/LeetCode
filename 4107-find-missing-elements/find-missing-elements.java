import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        if (nums == null || nums.length == 0) return ans;

        Arrays.sort(nums);
        
        int i = 0; 
        int current = nums[0]; 
        int min = nums[0];
        int max=nums[nums.length-1];
        while (current <= max) {
            if (nums[i] == current) {
                i++;
            } else {
                ans.add(current);
            }
            current++;
        }
        
        return ans;
    }
}
