# Flipping an Image

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an `n x n` binary matrix `image`, flip the image  **horizontally**, then invert it, and return  *the resulting image*.

To flip an image horizontally means that each row of the image is reversed.

- For example, flipping [1,1,0] horizontally results in [0,1,1].

To invert an image means that each `0` is replaced by `1`, and each `1` is replaced by `0`.

- For example, inverting [0,1,1] results in [1,0,0].

 

 **Example 1:** 

```
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

```

 **Example 2:** 

```
Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

```

 

 **Constraints:** 

- n == image.length
- n == image[i].length
- 1 <= n <= 20
- images[i][j] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.4 MB (beats 94.33%)  
**Submitted:** 2026-08-25T15:41:01.923Z  

```java
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = image[i].length - 1;
            
            while (left <= right) {
                if (left == right) {
                    // Middle element in an odd-length row: just invert it
                    image[i][left] ^= 1;
                } else {
                    // Swap elements and invert both at the same time
                    int temp = image[i][left] ^ 1;
                    image[i][left] = image[i][right] ^ 1;
                    image[i][right] = temp;
                }
                left++;
                right--;
            }
        }
        
        return image;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/flipping-an-image/)