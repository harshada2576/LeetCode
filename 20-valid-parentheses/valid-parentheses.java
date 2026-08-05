import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    if ((ch == ')' && stack.peek() != '(') ||
                            (ch == '}' && stack.peek() != '{') ||
                            (ch == ']' && stack.peek() != '[')) {
                        return false;
                    }

                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
