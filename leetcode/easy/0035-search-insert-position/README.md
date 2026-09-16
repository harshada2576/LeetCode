# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45 MB (beats 12.41%)  
**Submitted:** 2026-09-16T16:25:05.947Z  

```java
class Solution {
    public int searchInsert(int[] arr, int x) {
      int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {
                ans = mid;       
                end = mid - 1;   
            } else {
                start = mid + 1;
            }
        }

        return start;  
    }
}


/*class Solution {
    public int findCeil(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {
                ans = mid;       
                end = mid - 1;   
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}*/
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)