class Solution { 
    public int maxContainers(int n, int w, int maxWeight) { 
        int cells = n * n; 
        int possibleContainers = maxWeight / w;
        return Math.min(cells, possibleContainers);
    } 
}
