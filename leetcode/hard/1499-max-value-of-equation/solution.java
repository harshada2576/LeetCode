/*class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int m=Integer.MIN_VALUE;
        int i=0 , j=points.length-1;
        while(i < points.length && j >= 0 && i < j){
            int d=Math.abs(points[i][0] - points[j][0]);
            if(d <= k){
                m=Math.max(points[i][1] + points[j][1] + d, m);
            }
            i++; 
            j--;
        }
        return m;
    }
}
*/


/*
class Solution{
public int findMaxValueOfEquation(int[][] points, int k) {
    int m = Integer.MIN_VALUE;

    for (int j = 1; j < points.length; j++) {
        for (int i = 0; i < j; i++) {

            if (points[j][0] - points[i][0] <= k) {
                int value = points[i][1] + points[j][1]
                          + points[j][0] - points[i][0];

                m = Math.max(m, value);
            }
        }
    }

    return m;
}
}
*/
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < points.length; j++) {

            // Remove points that are too far from current point
            while (!deque.isEmpty() &&
                   points[j][0] - points[deque.peekFirst()][0] > k) {
                deque.pollFirst();
            }

            // Use the best previous point
            if (!deque.isEmpty()) {
                int i = deque.peekFirst();

                int value = points[i][1] - points[i][0]
                          + points[j][1] + points[j][0];

                max = Math.max(max, value);
            }

            // Maintain decreasing order of (y - x)
            while (!deque.isEmpty() &&
                   points[deque.peekLast()][1] - points[deque.peekLast()][0]
                   <= points[j][1] - points[j][0]) {
                deque.pollLast();
            }

            deque.offerLast(j);
        }

        return max;
    }
}

    