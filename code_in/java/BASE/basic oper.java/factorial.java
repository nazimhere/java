import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter an  no.");
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int af=1;

        while(n>0){
           // n=n*(n-1);
            af *=n;
            n--;
        }
        System.out.println(af);
    }
}
