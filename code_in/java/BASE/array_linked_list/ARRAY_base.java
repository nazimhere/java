package array;
import java.util.Scanner;
class Nin {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int[] array =new int[a];

        System.out.println("ENter the no. in array");
for(int i=0;i<a;i++){
    array[i]=s.nextInt();
    
}
System.out.println("the elements of array are");
for (int i=0;i<a;i++){
    System.out.println(array[i]);
}
    }

     
}

