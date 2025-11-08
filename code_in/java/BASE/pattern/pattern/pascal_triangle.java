import java.util.Scanner;
public class pascal_triangle {
    public static int fact(int k) {
        int fact = 1;
        for (int i = 1; i <= k; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("enter a no.");
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        // int b=ac.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {

                    System.out.print("  ");//taking input
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print(fact(i) / (fact(j) * fact(i - j)) + "   ");
                }

                System.out.println("   ");
            }

        }
    }

