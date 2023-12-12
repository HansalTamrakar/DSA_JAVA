import java.util.Arrays;

public class delete {
    public static int[] deleteAtFirst(int arr[], int pos) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
            
        }
        arr[arr.length-1] = 0 ;
        return arr;
    }

    public static int[] deleteAtMid(int arr[], int pos) {
        for (int i = pos - 1; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = 0 ;
        return arr;
    }

    public static int[] deleteAtLast(int arr[], int pos) {
        arr[arr.length-1]=0;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int pos = 5;
        // System.out.println(Arrays.toString(deleteAtFirst(arr, pos)));
        // System.out.println(Arrays.toString(deleteAtMid(arr, pos)));
        System.out.println(Arrays.toString(deleteAtLast(arr, pos)));
    }

}
