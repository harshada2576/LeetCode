class Solution 
{
    public int reverse(int num)
    {
        int reversed = 0; 
        int remainder=0;
        while(num>0)
        {
            remainder=num%10;
            reversed=remainder+reversed*10;
            num=num/10;
        }
        return reversed;
    }
    public int mirrorDistance(int n) 
    {
        return Math.abs(n-reverse(n));
        
    }
}