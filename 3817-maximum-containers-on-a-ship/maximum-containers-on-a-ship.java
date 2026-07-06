class Solution {
    public int maxContainers(int n, int w, int maxWeight) 
    {
        int cells=n*n;
        if(cells*w <= maxWeight)
            return cells;
        else
            {
                int c=cells;
                while(c*w > maxWeight)
                {
                    c--;
                }
                return c;
            }
        
    }
}