import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        if (nums == null || nums.length == 0) return ans;

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        Arrays.sort(nums);
        
        int i = 0; 
        int current = min; 
        
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
