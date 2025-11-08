import java.util.Scanner;

public class permutation {
    public static int perm(int a){
        int fact=1;
        for(int o=1;o<=a;o++){
            fact*=o;

        }return fact;
    }
    public static void main(String[] args) {
        System.out.println("enter an no. for permutation");
        Scanner sc=new Scanner (System.in);
        int i=sc.nextInt();
        int j= sc.nextInt();
        System.out.println(perm(i)/perm(i-j));

    }
}

