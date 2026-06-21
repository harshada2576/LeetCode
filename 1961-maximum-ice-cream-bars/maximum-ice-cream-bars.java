import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // 1. Find the maximum cost to define our frequency array size
        int maxCost = 0;
        for (int cost : costs) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        
        // 2. Build the frequency array (Counting Sort bucket)
        int[] frequency = new int[maxCost + 1];
        for (int cost : costs) {
            frequency[cost]++;
        }
        
        int iceCreamCount = 0;
        
        // 3. Iterate through possible costs greedily from cheapest to most expensive
        for (int price = 1; price <= maxCost; price++) {
            if (frequency[price] == 0) {
                continue;
            }
            
            // If the cheapest remaining item is unaffordable, stop immediately
            if (coins < price) {
                break;
            }
            
            // Calculate how many bars of this price we can afford
            long totalCostForBars = (long) price * frequency[price];
            
            if (coins >= totalCostForBars) {
                // Buy all available bars at this price point
                coins -= totalCostForBars;
                iceCreamCount += frequency[price];
            } else {
                // Buy only the maximum possible bars we can afford out of the pool
                int barsToBuy = coins / price;
                iceCreamCount += barsToBuy;
                break; // No more coins left to buy more expensive bars
            }
        }
        
        return iceCreamCount;
    }
}
