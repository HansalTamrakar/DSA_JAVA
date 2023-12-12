import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDuplicate(int[] arr) {
        int j = 1;
        
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j=j+1;

            }
        }
        int[] array = new int[j];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
            
        }
        return array;

    }

    

    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 20, 20, 30, 30, 40, 40, 50, 60 };
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
}