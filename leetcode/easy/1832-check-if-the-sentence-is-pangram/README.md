# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 34.69%)  
**Memory:** 43.2 MB (beats 17.34%)  
**Submitted:** 2026-08-22T17:15:40.458Z  

```java
import java.util.ArrayList;

class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        if(sentence.length() == 1)
            return true;

        ArrayList<Character> seen = new ArrayList<>();

        for (char ch : sentence.toCharArray()) {
            // Add to list only if character isn't already present
            if (!seen.contains(ch)) {
                seen.add(ch);
            }
            
            // Early return if all 26 letters are present
            if (seen.size() == 26) {
                return true;
            }
        }

        return seen.size() == 26;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)