import java.util.Scanner;
public class armstrong_no {
    static void Check(int n) {
        int count = 0;
        int o = n;
        int asli = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        int sum = 0;
        while (o > 0) {
            int as = o % 10;
            sum = (int) (sum + Math.pow(as, count));
            o = o / 10;
        }
        if (sum == asli) {
            System.out.println("the no is armstrong no." + asli);
        } else {
            System.out.println("the no. is not a armstrong no." + asli + " " + sum);
        }
    }

       public  static void main (String[] args) {
        
            Scanner a = new Scanner(System.in);
System.out.println("enter a no. for check to armstrong no. or not");
            Check(a.nextInt());
        }
}


