class Solution 
{
    boolean isSubstring(String text, String word)
    {        
        return text.contains(word);
    }

    public int numOfStrings(String[] patterns, String word) 
    {
        int c = 0;

        for(int i = 0; i < patterns.length; i++)
        {
            if(isSubstring(word, patterns[i]))
                c++;
        }

        return c;
    }
}