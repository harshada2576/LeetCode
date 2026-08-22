import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        
        // Java's List.add(index, element) automatically handles shifting
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        
        // Convert List back to primitive int array
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        
        return target;
    }
}