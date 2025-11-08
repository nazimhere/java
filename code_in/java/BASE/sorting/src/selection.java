public class selection {
    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    static int max(int[] arr,  int b) {
       // int d = arr.length - 1;
        int g = 0;
        for (int i = 0; i < b; i++) {
            if (arr[i] > arr[g]) {
                // arr[g+1]=arr[g];
                g = i;

            }
        }
        return g;
    }

    static void select(int[] arr,  int e) {

        for (int i = 0; i < e; i++) {
            int g = e - 1 - i;
            int ma = max(arr, g + 1);
            swap(arr, ma, g);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 235, 63, 32, -4, 346, 0};
        int t = arr.length;
        select(arr, t);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}