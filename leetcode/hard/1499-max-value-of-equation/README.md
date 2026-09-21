# Max Value of Equation

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array `points` containing the coordinates of points on a 2D plane, sorted by the x-values, where `points[i] = [xi, yi]` such that `xi < xj` for all `1 <= i < j <= points.length`. You are also given an integer `k`.

Return  *the maximum value of the equation* `yi + yj + |xi - xj|` where `|xi - xj| <= k` and `1 <= i < j <= points.length`.

It is guaranteed that there exists at least one pair of points that satisfy the constraint `|xi - xj| <= k`.

 

 **Example 1:** 

```
Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
Output: 4
Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
No other pairs satisfy the condition, so we return the max of 4 and 1.

```

 **Example 2:** 

```
Input: points = [[0,0],[3,0],[9,2]], k = 3
Output: 3
Explanation: Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.

```

 

 **Constraints:** 

- 2 <= points.length <= 105
- points[i].length == 2
- -108 <= xi, yi <= 108
- 0 <= k <= 2 * 108
- xi < xj for all 1 <= i < j <= points.length
- xi form a strictly increasing sequence.

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 26.47%)  
**Memory:** 114.4 MB (beats 75.49%)  
**Submitted:** 2026-09-21T15:18:30.987Z  

```java
/*class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int m=Integer.MIN_VALUE;
        int i=0 , j=points.length-1;
        while(i < points.length && j >= 0 && i < j){
            int d=Math.abs(points[i][0] - points[j][0]);
            if(d <= k){
                m=Math.max(points[i][1] + points[j][1] + d, m);
            }
            i++; 
            j--;
        }
        return m;
    }
}
*/


/*
class Solution{
public int findMaxValueOfEquation(int[][] points, int k) {
    int m = Integer.MIN_VALUE;

    for (int j = 1; j < points.length; j++) {
        for (int i = 0; i < j; i++) {

            if (points[j][0] - points[i][0] <= k) {
                int value = points[i][1] + points[j][1]
                          + points[j][0] - points[i][0];

                m = Math.max(m, value);
            }
        }
    }

    return m;
}
}
*/
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < points.length; j++) {

            // Remove points that are too far from current point
            while (!deque.isEmpty() &&
                   points[j][0] - points[deque.peekFirst()][0] > k) {
                deque.pollFirst();
            }

            // Use the best previous point
            if (!deque.isEmpty()) {
                int i = deque.peekFirst();

                int value = points[i][1] - points[i][0]
                          + points[j][1] + points[j][0];

                max = Math.max(max, value);
            }

            // Maintain decreasing order of (y - x)
            while (!deque.isEmpty() &&
                   points[deque.peekLast()][1] - points[deque.peekLast()][0]
                   <= points[j][1] - points[j][0]) {
                deque.pollLast();
            }

            deque.offerLast(j);
        }

        return max;
    }
}

    
```

---

[View on LeetCode](https://leetcode.com/problems/max-value-of-equation/)