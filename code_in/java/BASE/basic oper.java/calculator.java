import java.util.Scanner;


public class calculator {
    public static void main(String[] args){
        System.out.println("enter 1 no.");
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        System.out.println("enter 2 no.");
        Scanner f=new Scanner(System.in);
        int b=f.nextInt();
        System.out.println("enter 1=add,2-diff,3-div,4-multi");
        Scanner n=new Scanner (System.in);
        int r= n.nextInt();

        if (r==1) {
            System.out.println("addtion");
            System.out.println(a+b);
        } else if (r==2) {
            System.out.println("subtraction");
            System.out.println(a-b);
        }else if(r==3){
            System.out.println("division");
            System.out.println(a/b);
        } else if (r==4) {
            System.out.println("multiplication");
            System.out.println(a * b);
        }
        else {
            System.out.println("INVALID NO.");

        }
        }

    }

