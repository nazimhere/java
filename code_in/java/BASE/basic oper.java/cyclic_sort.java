import java.util.Arrays;

public class cyclic_sort {
    static void swap(int [] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    static void cyclic(int [] a,int n,int c){
int i=0;
  while(i<c){
    int eq=a[i];
    if(a[i]!=a[eq]){
        swap(a,i,eq);
    }
    else
        i++;
}
    }
    static void duc(int [] a, int d, int n){
        for(int i=0;i<a.length;i++){
            if(a[i]!=i){
                System.out.println("duclicate is "+ a[i]+" at index "+ i);
                a[i]=i;
            }
        }
    }
    public static void main(String[] args) {
        int[] s={1,5,3,2,5,0}; //[1--n];
        cyclic(s,0,s.length);
        System.out.println(Arrays.toString(s));
        duc(s,0,s.length);
        System.out.println(Arrays.toString(s));
    }
}
