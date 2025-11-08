import java.util.Scanner;

public class Man {
    static Scanner n=new Scanner(System.in);

    static String greet(String a){
        String greeting="hey baby how are you ";
        System.out.println(a+"hello ,ji kaise ho app,ke haal haga ji aapka");
        return greeting ;
    }
    static void sum(){
System.out.println("enter a no.");
int a=n.nextInt();
System.out.println("enter a another no.");
int s=n.nextInt();
int sum=s+a;
System.out.println("sum is "+ sum);}
 public static void main(String [] args){
    
    sum();
    sum();
    System.out.println(greet("faizu "));
}

 }
   
