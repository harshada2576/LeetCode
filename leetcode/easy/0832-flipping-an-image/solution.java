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