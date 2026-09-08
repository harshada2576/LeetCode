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