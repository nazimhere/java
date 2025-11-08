import java.util.Scanner;

public class cross_pattern {

    public static void main(String[] args) {
        int i, j;
        System.out.println(" enter a no. for loop");
        Scanner a = new Scanner(System.in);
        int av = a.nextInt();
        //int mid=(av/2)+1;
        for (i = 1; i <= av; i++) {
            for (j = 1; j <= av ; j++) {
                if (i == j || i + j == av+1)
                    System.out.print("@" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println(" ");
        }
    }
}
