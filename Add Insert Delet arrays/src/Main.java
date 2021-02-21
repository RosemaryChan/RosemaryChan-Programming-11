import java.util.Arrays;

public class Main {
    static int[] add(int[] a) {
        int length = a.length;
        int[] b = new int[length + 2];
        for (int i = 0; i <= length + 1; i++) {
            if (i <= length-1) {
                b[i] = a[i];
            }
            else{
                b[i] = b[i-1]+1;
            }
        }
        return b;
    }
    static int[] sub(int[] a){
        int length = a.length - 1;
        int[] b = new int[length];
        for (int i = 0; i <= length - 1; i++) {
            if (i <= length) {
                b[i] = a[i];
            }
        }
        return b;
    }
    static int[] ins(int[] a) {
        int length = a.length + 1;
        int[] b = new int[length];
        for (int i = 0; i <= length - 1; i++) {
            if(i < 3) {
                b[i] = a[i];
            }
            if(i == 3){
                b[i] = b[i-1] +1;
            }
            if(i > 3){
                b[i] = a[i - 1];
            }
        }
        return b;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int[] b = add(a);
        int[] c = sub(a);
        int[] d = ins(a);
        System.out.println("Original:" + Arrays.toString(a));
        System.out.println("Add:" + Arrays.toString(b));
        System.out.println("Subtract:" + Arrays.toString(c));
        System.out.println("Insert:" + Arrays.toString(d));
    }
}