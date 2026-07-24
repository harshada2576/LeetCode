class Solution {
    public int sumBase(int n, int k) 
    {
        int s=0;
        while(n>0)
        {
          int r=n%k;
          n=n/k;
          s=s+r;  
        }
            return s;
        
    }
}