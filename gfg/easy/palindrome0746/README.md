# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`. Your task is to find if it is a palindrome.

 **Examples:** 

```
Input: n = 555
Output: true
Explanation: The number 555 reads the same backward as forward, so it is a palindrome.
```

```
Input: n = 123
Output: false
Explanation: The number 123 reads differently backward (321), so it is not a palindrome.
```

```
Input: n = -121
Output: true
Explanation: if number is palindrome, mainly ignore sign.
```

 **Constraints:** 
-109 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:35:33.517Z  

```java
class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            n = -n;
        }

        int original = n;
        long reversed = 0; while (n > 0) {
            reversed = (reversed * 10) + (n % 10);
            n /= 10;
        }

        return original == reversed;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome0746/1)