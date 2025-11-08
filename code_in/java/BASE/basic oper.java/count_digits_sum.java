import java.util.Scanner;

public class count_digits_sum {
    public static void main(String[] args) {
        System.out.println("enter a no.");
        //System.out.println(" prin");

        Scanner an=new Scanner(System.in);
        int a=an.nextInt();
        int sum=1,count=0;
     // for (int i=0;i<=)
           while(a>0) {
                int n=a%10;
                if(n!=0) {
               sum=sum*n;}
             // int count = 0;
               a = a / 10;
               count++;
           }
        System.out.println("the product of no. is =\t"+ sum);
               System.out.println("no of digits in no. is \t= "+count);
        //System.out.println(sum);

    }
}
