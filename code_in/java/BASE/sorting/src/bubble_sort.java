import java.util.Arrays;

public class bubble_sort {
   /* public static void swap(int s,int f){
       int t= s;
       s=f;
        f=t;
   }*/
    public static void main(String[] args) {
        int[] arr = {1, 25, 57, -8, 0, 4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
        //  System.out.println("enter a no. of your choice");
 public static void bubble(int [] arr){
        int s=arr.length;

        for (int i=0;i<s;i++) {
            for (int j = 1; j < s- i; j++) {
                if (arr[j] < arr[j-1]) {
                //  swap(arr[j], arr[j-1]);
                    int t=arr[j];
                    arr[j]=arr[j-1];
                        arr[j-1]=t;
                }

            }
        }
               // System.out.println(Arrays.toString(arr));


 };

}

