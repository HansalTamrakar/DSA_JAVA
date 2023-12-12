import java.util.Arrays;

public class search {
    public static int[] Search(int key, int[] arr) {

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {

                idx = i;
            }
        }
        return new int[] { key, idx };

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 2, 03, 0, 20, 5, 3, 6, 4 };
        int[] array = Search(6, arr);

        System.out.println(Arrays.toString(array));

    }
}
