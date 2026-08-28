# Add to Array-Form of Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The  **array-form**  of an integer `num` is an array representing its digits in left to right order.

- For example, for num = 1321, the array form is [1,3,2,1].

Given `num`, the  **array-form**  of an integer, and an integer `k`, return  *the  **array-form**  of the integer*  `num + k`.

 

 **Example 1:** 

```
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

```

 **Example 2:** 

```
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455

```

 **Example 3:** 

```
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

```

 

 **Constraints:** 

- 1 <= num.length <= 104
- 0 <= num[i] <= 9
- num does not contain any leading zeros except for the zero itself.
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 73.80%)  
**Memory:** 47.7 MB (beats 50.33%)  
**Submitted:** 2026-08-28T17:34:40.233Z  

```java
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k += num[i];
                i--;
            }

            ans.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(ans);

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-to-array-form-of-integer/)