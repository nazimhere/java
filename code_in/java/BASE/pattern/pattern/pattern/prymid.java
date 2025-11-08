package pattern;

import java.util.Scanner;

public class prymid {


    public static void main(String[] args) {
        System.out.print("enter a  no. ");
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= nst; k++) {

                //if (i==j||i+j==8) {
//System.out.print((char)(64+j )+" ");
                // }els
                System.out.print("*" + " ");
            }
            nsp--;
            nst += 2;


            // System.out.print(" "+" ");
            //a++;


            System.out.println(" ");
        }

        // Scanner s = new Scanner(System.in);
        //  int d = s.nextInt();
        int nspa = 1;
        int nsta = nst-4;

        for (int l = 1; l <= n; l++) {
            for (int j = 1; j <= nspa; j++) {
                System.out.print(" "+" " );
            }
            for (int k = 1; k <= nsta; k++) {


                System.out.print("*" + " ");
            }
            nspa++;
            nsta-=2;
            System.out.println(" ");
        }
    }
}