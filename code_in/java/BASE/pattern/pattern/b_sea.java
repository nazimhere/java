public class b_sea{
    public static int  b_search(int [] arr,int target) {
        int a = 0;
        int c = arr.length - 1;
        //int b = a + (c - a) / 2;
        while(a <= c){
            int b = a + (c - a) / 2;
            if (target > arr[b]) {
                a = b + 1;
            } else if (target < arr[b]) {
                c = b - 1;
            } else {
                return b;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar={1,3,5,7,55,76,121,124,800};
        int target=76;
        int result=b_search(ar,target);
        System.out.println("no is found "+result);
    }
}