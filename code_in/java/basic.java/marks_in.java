
import java.util.Scanner;
public class marks_in {
    public static void main(String[] args) {
        int [] marks=new int [5];
        Scanner s=new Scanner (System.in);
        System.out.println("enter marks ");
        for (int i=0;i<=4;i++){
            marks[i]=s.nextInt();
        }int sum=0;
        for(int i=0;i<marks.length;i++){

            sum=sum+marks[i];
        }
        System.out.println("sum is ="+sum);
    }
}
