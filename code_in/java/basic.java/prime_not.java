
import java.util.Scanner;
public class prime_not {
    static void prime(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("number is not prime");
            break;
            }
            else {
             System.out.println("no. is  prime");
             break;
            }
        }
    }  
    public static void main(String[] args) {
    System.out.println("enter a no.");
  Scanner s = new Scanner(System.in);
  prime(s.nextInt());
    }    
}