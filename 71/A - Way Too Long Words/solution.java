import java.util.Scanner;
public class Main{
    static String ans(String str){
        if(str.length()>10){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        sb.append(str.length()-2);
        sb.append(str.charAt(str.length()-1));
        return sb.toString();            
        }
        else{
            return str;
        }
        
    }
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
          int n=sc.nextInt();
          while(n>0){
            String w=sc.next();
     System.out.println(ans(w));
     n--;
          }
 
    }
    
}