import java.util.Scanner;

public class basic_pattern_char {
    public static void main(String[] args) {
        System.out.println("enter a no. to print pattern");
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print((char)(96+j));
            }
            System.out.println(' ');
        }
    }
}
