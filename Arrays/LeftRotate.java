import java.util.Arrays;

public class LeftRotate {
    public static int[] leftRotate(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = x;

        return arr;
    }
    public static int[] leftRotateBetter(int[] arr,int d) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
            
        }
        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
            
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length-d+i] = temp[i];
            
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 23, 45, 69, 56 };
        int d = 2;
          
        System.out.println(Arrays.toString(leftRotate(arr)));
        //Naive approach to move d times
        for (int i = 0; i < d; i++) {
            leftRotate(arr);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(leftRotateBetter(arr,d)));

    }

}
