# Maximum Population Year

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a 2D integer array `logs` where each `logs[i] = [birthi, deathi]` indicates the birth and death years of the `ith` person.

The  **population**  of some year `x` is the number of people alive during that year. The `ith` person is counted in year `x`'s population if `x` is in the  **inclusive**  range `[birthi, deathi - 1]`. Note that the person is  **not**  counted in the year that they die.

Return  *the  **earliest**  year with the  **maximum population***.

 

 **Example 1:** 

```
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

```

 **Example 2:** 

```
Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation: 
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
```

 

 **Constraints:** 

- 1 <= logs.length <= 100
- 1950 <= birthi < deathi <= 2050

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.6 MB (beats 31.02%)  
**Submitted:** 2026-09-01T17:00:43.914Z  

```java
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];

        // Record changes in population
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int earliestYear = 1950;

        // Calculate population year by year
        for (int i = 0; i < 101; i++) {
            currentPopulation += population[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                earliestYear = 1950 + i;
            }
        }

        return earliestYear;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-population-year/)