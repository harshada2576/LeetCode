class Solution {
    public int maxNumberOfBalloons(String text) {
        // Step 1: Count frequencies of all lowercase letters
        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }
        
        // Step 2: Extract counts for the letters in "balloon"
        int b = counts['b' - 'a'];
        int a = counts['a' - 'a'];
        int l = counts['l' - 'a'] / 2; // Requires 2 per word
        int o = counts['o' - 'a'] / 2; // Requires 2 per word
        int n = counts['n' - 'a'];
        
        // Step 3: The bottleneck (minimum value) is our maximum possible words
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
