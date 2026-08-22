import java.util.Scanner;
public class Main{
    static String ans(int n){
        if(n > 2 && n%2 == 0){
            return "Yes";
        }
        else{
            return "No";
        }
        
    }
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int w=sc.nextInt();
     System.out.println(ans(w));
    }
    
}