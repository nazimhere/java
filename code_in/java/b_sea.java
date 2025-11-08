
public class b_sea {
     public static int b_sear(int[] arr,int target){
         int start=0;
         int end= arr.length-1;
         while (start<=end){
              int mid=start+(end-start)/2;
               if(target>arr[mid]){
                   start=mid+1;
               } else if (target<arr[mid]){
                   end=mid-1;
               }
               else
                 //System.out.println("target is the mid one ");
                   return mid;}
    return -1;
     }
    public static void main(String[] args) {
 int [] ar= {21,32,56,78,80,99,352};
  int tag =78;
  int b=b_sear(ar,tag);
        System.out.print(" the no. of index of target is = ");
        System.out.println(b);
     }
}
