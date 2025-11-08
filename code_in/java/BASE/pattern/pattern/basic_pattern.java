

import java.util.Scanner;

public class basic_pattern {
    public static void main(String[] args) {
        System.out.println("enter a no.");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 != 0) {
                    System.out.print(0+" ");
                }

           else {
                    System.out.print(1+" ")
                    ;}
                }
                    System.out.println(" ");

            }
        }}