
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class square_patten{
    public static void main(String[] args){
        System.out.println("enter an no. to print a pattern ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=2*n+15;
                for (int i=1;i<=2*n-1;i++) {
                    for (int j = 1; j <= 2 * n - 1; j++) {
                        int min = Math.min(Math.min(i, j), Math.min(m +1 - i, m + 1 - j));
                        System.out.print((n - min + 1) + " ");
                    }
                    System.out.println(" ");
                }
    }
}
