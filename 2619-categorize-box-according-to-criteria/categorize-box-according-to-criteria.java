class Solution {
    //Function
    int isBulky(int length, int width, int height, int mass)
    {
        long v=(long)length*width*height;
        if(length >= Math.pow(10, 4) || width >= Math.pow(10, 4) || height >= Math.pow(10, 4) || mass >= Math.pow(10,4))
            return 1;
        else if( v >= Math.pow(10, 9) )
            return 1;
        else
        return 0;    
    }
    //function
    int isHeavy(int mass) {
        if (mass >= 100)
            return 1;
        else
            return 0;
    }

    public String categorizeBox(int length, int width, int height, int mass) 
    {
        if(isBulky( length,  width,  height, mass)==1 && isHeavy(mass)==1)
            return "Both";
        else if(isBulky( length,  width,  height,  mass)==0 && isHeavy( mass)==0)
            return "Neither";

        else if(isBulky( length,  width,  height,  mass)==1 && isHeavy( mass)==0)
            return "Bulky";

        else 
            return "Heavy";
    
    }
}