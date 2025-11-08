import java.util.Arrays;

public class insertion_sort {
    static void swap(int [] arr,int a,int c){
        int t=arr[a];
        arr[a]=arr[c];
        arr[c]=t;
    }
    static void insert(int [] s) {
        for (int i = 0; i <= s.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (s[j - 1] > s[j]) {
                    swap(s, j - 1, j);
                } else
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={23,46,-5,357,7,9,36,0};
        insert(arr);
        for(int s:arr){
        System.out.print("\t"+ s);
    }}
}