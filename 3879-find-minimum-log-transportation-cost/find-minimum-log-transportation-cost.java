class Solution {
    public long minCuttingCost(int n, int m, int k) 
    {
         return (long) k * Math.max(0, Math.max(n - k, m - k));
    }
}