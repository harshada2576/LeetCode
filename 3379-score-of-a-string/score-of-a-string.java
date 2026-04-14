class Solution 
{
    int abs(char ch1,char ch2)
    {
        return Math.abs(ch1 - ch2); 
    }
    public int scoreOfString(String s) 
    {
        int sum=0;
        for(int i=0; i<s.length()-1;i++)
        {
            sum+=abs(s.charAt(i),s.charAt(i+1));
        }
        return sum;
        
    }
}