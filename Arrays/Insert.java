import java.util.Arrays;

public class Insert {
    public static int[] insertAtLast(int key, int[] arr) {

        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[newarr.length - 1] = key;
        return newarr;

    }

    public static int[] insertatMid(int key, int[] arr, int pos) {

        for (int i = arr.length - 2; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = key;
        return arr;

    }

    public static int[] insertatFirst(int key, int[] arr) {

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = key;
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20,30,40,50,60, 70, 80, 90, 0 };
        int key = 100;
        int pos = 5;
        // System.out.println(Arrays.toString(insertAtLast(key, arr)));
        // System.out.println(Arrays.toString(insertatMid(key, arr ,pos)));
        // System.out.println(Arrays.toString(insertatFirst(key, arr)));

    }
}
