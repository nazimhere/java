import java.util.Scanner;

public class basic_if_else {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("enter a no. to check even or odd");
        int a = as.nextInt();
        if (a==0)
            System.out.println("zero ");
        if (a % 2 == 0) {
            System.out.println("even no");
        } else {
            System.out.println("odd no");
        }
    }
}