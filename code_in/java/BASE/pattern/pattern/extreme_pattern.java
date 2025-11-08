import java.util.Scanner;

public class extreme_pattern {

    public static void main(String[] args) {
        int i, j;
        System.out.println(" enter a no. for loop");
        Scanner a = new Scanner(System.in);
        int av = a.nextInt();
        //int mid=(av/2)+1;+
     /*   for (i = 1; i <= av; i++) {
            for (j = 1; j <= av - i+1; j++) {
                System.out.print(" " + " ");
            } //spaces
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*"+" " );//printing pattern
            }
            //   System.out.print("*" + " ");


        System.out.println(" ");}
    }

}*/
        int nsp = 0, nst = av;
        for (i = 1; i <= av; i++) {
            for (j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (j = 1; j <=nst; j++) {
                System.out.print("*" + " ");
            }
        nsp++;
       nst--;
        System.out.println(" ");}

    }

}