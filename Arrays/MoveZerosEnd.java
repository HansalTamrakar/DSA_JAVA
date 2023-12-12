import java.util.Arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j = j + 1;

            }

        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;

        }
        return arr;
    }

    public static int[] moveZerosEndAnother(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

    public static int[] moveZerosEndEffective(int[] arr) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = 0;
                arr[count] = temp;
                count = count + 1;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 0, 36, 0, 12, 0, 545, 12 };
        System.out.println(Arrays.toString(moveZerosEnd(arr)));
        System.out.println(Arrays.toString(moveZerosEndAnother(arr)));
        System.out.println(Arrays.toString(moveZerosEndEffective(arr)));

    }

}
