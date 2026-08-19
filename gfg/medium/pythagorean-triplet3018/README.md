# Pythagorean Triplet

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**, return true if there is a  **triplet (a, b, c)**  from the array (where a, b, and c are on different indexes) that satisfies  **a2 + b2 = c2**, otherwise return false.

 **Examples:** 

```
Input: arr[] = [3, 2, 4, 6, 5]
Output: true
Explanation: a=3, b=4, and c=5 forms a pythagorean triplet.

```

```
Input: arr[] = [3, 8, 5]
Output: false
Explanation: No such triplet possible.
```

```
Input: arr[] = [1, 1, 1]
Output: false
```

 **Constraints:** 
1 <= arr.size() <= 105
1 <= arr[i] <= 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:43:34.015Z  

```java
class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int maxVal = 0;
        for (int num : arr) {
            maxVal = Math.max(maxVal, num);
        }

        boolean[] exists = new boolean[maxVal + 1];
        for (int num : arr) {
            exists[num] = true;
        }

        for (int a = 1; a <= maxVal; a++) {
            if (!exists[a]) continue;

            for (int b = a + 1; b <= maxVal; b++) {
                if (!exists[b]) continue;

                int sumSquare = (a * a) + (b * b);
                int c = (int) Math.sqrt(sumSquare);

                if (c * c == sumSquare && c <= maxVal && exists[c]) {
                    return true;
                }
            }
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pythagorean-triplet3018/1)