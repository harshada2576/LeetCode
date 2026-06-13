class Solution {
    // Helper method to calculate the weight of a single word
    private int weightOfWord(String s, int[] weights) {
        int weight = 0;
        for (int i = 0; i < s.length(); i++) {
            // Find the 0-indexed position of the character ('a' -> 0, 'b' -> 1, ...)
            int charIndex = s.charAt(i) - 'a';
            weight += weights[charIndex];
        }
        return weight;
    }

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // Step 1: Calculate total weight
            int totalWeight = weightOfWord(word, weights);
            
            // Step 2: Take weight modulo 26
            int remainder = totalWeight % 26;
            
            // Step 3: Map to reverse alphabetical order (0 -> 'z', 1 -> 'y', ..., 25 -> 'a')
            char mappedChar = (char) ('z' - remainder);
            
            // Step 4: Append to result
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}
