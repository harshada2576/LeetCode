# Count Commas in Range

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`.

Return the  **total**  number of commas used when writing all integers from `[1, n]` (inclusive) in  **standard**  number formatting.

In  **standard**  formatting:

- A comma is inserted after every three digits from the right.
- Numbers with fewer than 4 digits contain no commas.

 

 **Example 1:** 

 **Input:**  n = 1002

 **Output:**  3

 **Explanation:** 

The numbers `"1,000"`, `"1,001"`, and `"1,002"` each contain one comma, giving a total of 3.

 **Example 2:** 

 **Input:**  n = 998

 **Output:**  0

 **Explanation:** 

All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.

 

 **Constraints:** 

- 1 <= n <= 105

## Solution

**Language:** Java  
**Runtime:** 321 ms (beats 5.40%)  
**Memory:** 42.8 MB (beats 8.32%)  
**Submitted:** 2026-09-08T14:18:30.363Z  

```java
class Solution {
    int comma(int n){
        int len=(int)Math.log10(n)+1;
        return (len-1)/3;
    }
    public int countCommas(int n) {
        int c=0;
        if(n < 1000)
            return 0;
       for(int i=n; i>999; i--){
            c+=comma(i);
       }
       return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range/)