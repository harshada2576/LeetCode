# Create Target Array in the Given Order

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays of integers `nums` and `index`. Your task is to create  *target*  array under the following rules:

- Initially target array is empty.
- From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
- Repeat the previous step until there are no elements to read in nums and index.

Return the  *target*  array.

It is guaranteed that the insertion operations will be valid.

 

 **Example 1:** 

```
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]

```

 **Example 3:** 

```
Input: nums = [1], index = [0]
Output: [1]

```

 

 **Constraints:** 

- 1 <= nums.length, index.length <= 100
- nums.length == index.length
- 0 <= nums[i] <= 100
- 0 <= index[i] <= i

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.6 MB (beats 10.05%)  
**Submitted:** 2026-08-22T16:44:19.549Z  

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        
        // Java's List.add(index, element) automatically handles shifting
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        
        // Convert List back to primitive int array
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        
        return target;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/create-target-array-in-the-given-order/)