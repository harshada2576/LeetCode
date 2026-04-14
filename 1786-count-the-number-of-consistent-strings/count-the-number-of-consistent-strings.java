import java.util.*;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < allowed.length(); i++)
        {
            list.add(allowed.charAt(i));
        }

        int count = 0;

        // check each word
        for(int i = 0; i < words.length; i++)
        {
            boolean isValid = true;

            for(int j = 0; j < words[i].length(); j++)
            {
                if(!list.contains(words[i].charAt(j)))
                {
                    isValid = false;
                    break;
                }
            }

            if(isValid)
            {
                count++;
            }
        }

        return count;
    }
}