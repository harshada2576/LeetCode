# Jump Game

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`. You are initially positioned at the array's  **first index**, and each element in the array represents your maximum jump length at that position.

Return `true` *if you can reach the last index, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

```

 **Example 2:** 

```
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 89.63%)  
**Memory:** 47.8 MB (beats 80.30%)  
**Submitted:** 2026-09-21T15:41:21.286Z  

```java
/*
class Solution {
    public boolean canJump(int[] nums) {
      int i=0, index=0;
      while(i < nums.length){
            index=index + nums[i];
            i++;
      } 
      return index >= nums.length;
    }
}
*/
class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // We cannot even reach this position
            if (i > maxReach) {
                return false;
            }

            // Update the farthest position we can reach
            maxReach = Math.max(maxReach, i + nums[i]);

            // We can already reach the last index
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jump-game/)