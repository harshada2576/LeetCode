# Peak Index in a Mountain Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer  **mountain**  array `arr` of length `n` where the values increase to a  **peak element**  and then decrease.

Return the index of the peak element.

Your task is to solve it in `O(log(n))` time complexity.

 

 **Example 1:** 

 **Input:**  arr = [0,1,0]

 **Output:**  1

 **Example 2:** 

 **Input:**  arr = [0,2,1,0]

 **Output:**  1

 **Example 3:** 

 **Input:**  arr = [0,10,5,2]

 **Output:**  1

 

 **Constraints:** 

- 3 <= arr.length <= 105
- 0 <= arr[i] <= 106
- arr is guaranteed to be a mountain array.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 80.2 MB (beats 57.59%)  
**Submitted:** 2026-09-17T16:08:59.398Z  

```java
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;  
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/peak-index-in-a-mountain-array/)