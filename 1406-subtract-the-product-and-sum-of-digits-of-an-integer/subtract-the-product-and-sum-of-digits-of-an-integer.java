class Solution 
{
    int pod(int n)
    {
        int pod=1;
        while(n>0)
        {
            int digit=n%10;
            pod=pod*digit;
            n=n/10;
        }
        return pod;
    }
    int sod(int n)
    {
        int sod=0;
        while(n>0)
        {
            int digit=n%10;
            sod=sod+digit;
            n=n/10;
        }
        return sod;
    }
    public int subtractProductAndSum(int n) {
       return pod(n)-sod(n); 
    }
}