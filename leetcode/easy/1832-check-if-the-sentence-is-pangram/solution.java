import java.util.ArrayList;

class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        if(sentence.length() == 1)
            return true;

        ArrayList<Character> seen = new ArrayList<>();

        for (char ch : sentence.toCharArray()) {
            // Add to list only if character isn't already present
            if (!seen.contains(ch)) {
                seen.add(ch);
            }
            
            // Early return if all 26 letters are present
            if (seen.size() == 26) {
                return true;
            }
        }

        return seen.size() == 26;
    }
}