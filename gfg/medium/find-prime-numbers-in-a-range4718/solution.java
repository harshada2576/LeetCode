import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public List<Integer> primeRange(int l, int r) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (prime(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}