class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            // Extract the current character
            char c = columnTitle.charAt(i);
            // Convert character to its 1-based alphabetic value (A->1, B->2...)
            int value = c - 'A' + 1;
            // Shift the accumulated result left by 1 digit in base-26, then add current value
            ans = ans * 26 + value;
        }
        return ans;
    }
}
