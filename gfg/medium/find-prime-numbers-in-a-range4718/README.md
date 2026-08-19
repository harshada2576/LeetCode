# Primes in a Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers **l**  and  **r**, find and return all prime numbers in the range  **[l, r]**  (inclusive).

 **Examples:** 

```
Input: l = 1, r = 10
Output: [2, 3, 5, 7]
Explanation:
The prime numbers between 1 and 10 are 2, 3, 5 and 7.
```

```
Input: l = 2, r = 5
Output: [2, 3, 5]
Explanation:
The prime numbers between 2 and 5 are 2, 3 and 5.
```

 **Constraints:** 
1≤ l ≤ r ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T13:37:41.206Z  

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public List<Integer> primeRange(int l, int r) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (prime(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1)