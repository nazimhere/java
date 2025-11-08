
 package pattern;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        System.out.print("enter a  no. ");
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {

                //if (i==j||i+j==8) {
//System.out.print((char)(64+j )+" ");
                // }else
                System.out.print(k);
            }


        // System.out.print(" "+" ");
        //a++;


        System.out.println(" ");}
    }
}



