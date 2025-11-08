import java.util.Scanner;
 class char_search {
    public static char chadd (char[] letters , char target) {
        int s=0;
        int e=letters.length-1;
        while(s<=e) {
            int m = s + (e - s) / 2;
            if (target >= letters[m]) {
                s = m + 1;
            } else
                e = m-1;
        }
            return letters[s%letters.length];
    }
    public  static void main(String[] args) {
 char[] a = {'a','b','f','s'};
 char target='n';
 char s= chadd (a,target);
        System.out.println(s);}
}
