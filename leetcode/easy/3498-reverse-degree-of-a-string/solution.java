class Solution {
    public int reverseDegree(String s) {
        int degree = 0;

        for (int i = 0; i < s.length(); i++) {
            int reverseValue = 'z' - s.charAt(i) + 1;
            int position = i + 1;

            degree += reverseValue * position;
        }

        return degree;
    }
}