import java.sql.SQLOutput;
import java.util.Scanner;
public class insertion{
    public static void main (String[] args) {

        System.out.println("taking input from user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no.");
        int a =sc.nextInt();
        System.out.println("ENTER A MP 2");
        int b = sc.nextInt();

        int sum=a+b;
        System.out.println("sum os ");
        System.out.println(sum);
        int diff=a-b;
        System.out.println("difference is ");
        System.out.println(diff);

    }
}