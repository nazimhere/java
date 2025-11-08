
public class b_search {
     public static int b_sea(int[] arr,int target){
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
         System.out.println(start+" " +end);
         return end;
         // return start;return equal or least_greater no. called ***(celling no.)
         //if return -1; then = show weather the no. present or not
         //if return end; return equal or less than no called ***(floor of a no.)
     }
    public static void main(String[] args) {
 int [] ar= {21,32,56,78,80,99,352};
  int tag =90;
  int b=b_sea(ar,tag);
        System.out.print(" the no. of index of target is = ");
        System.out.println(b);
     }
}
