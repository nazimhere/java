import java.util.Scanner;

public class rectangle_pattern {

    public static void main(String [] args){
        int i,j;
        System.out.println(" enter a no. for loop");
        Scanner a=new Scanner (System.in);
        int av=a.nextInt();
        //int mid=(av/2)+1;
        for(i=1;i<=av;i++){
            for (j=1;j<=av+2;j++){
                if(i==1||j==1||i==av||j==av+2)
                    System.out.print("@"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println(" ");
        }
    }}
