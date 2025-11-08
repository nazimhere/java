import java.sql.SQLOutput;
import java.util.Scanner;
//public void Percentage(int a[]){


public class JAVinsert {
    public static void main(String[] args) {
        System.out.println("nazim is here");
        System.out.println("enter no or score of  5 subjects");
        float[] marks=new float[5];
        Scanner mark=new Scanner(System.in);
        for ( int i=0;i<=4;i++)
        { marks[i]=mark.nextFloat();

        }
       // for (int j=1;j<=5;j++) {
        // System.out.print(marks[j]);
        //    System.out.print("\t");}
        float sum=0;

        for (float element:marks){
            sum=sum+element;
            System.out.print(element);
            System.out.print("\t");}
        float q=11.23f;
        System.out.println("\nsum of marks is "+sum);
    for(float element:marks){
        if(element==q){
            System.out.println("q is present here");
            break;}
          //  continue;}
        else
            System.out.println("not present");
continue ;
    }

}}
