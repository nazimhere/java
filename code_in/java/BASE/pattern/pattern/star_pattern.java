import java.util.Scanner;

public class star_pattern {
   public  static void pehla (int a){
       System.out.println("nazim is here");
       System.out.println(Math.sqrt(a));
   }
    public static void main(String[] args) {
        System.out.println("enter a no.");
        Scanner a=new Scanner (System.in);
        int n=a.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++)
            {if (i%2!=0) { System.out.print((char)(i+64)+" ");}

            else{
            System.out.print(i+" ");
        }}
            System.out.println(" ");
        }
        System.out.println(Math.random()*10);pehla(4);
    }


    }

