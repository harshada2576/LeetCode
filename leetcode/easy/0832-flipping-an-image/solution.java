class Solution {
    int[][] invert(int[][] image){
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                if(image[i][j] == 0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;
    }
    int[][] fliphori(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            
            // Swap elements from ends moving inward
            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                
                left++;
                right--;
            }
        }
        return image;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        fliphori(image);
        invert(image);
        return image;

    }
}