import java.util.Arrays;

public class Leaders {
    public static void leaders(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            int num = arr[i];
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (num <= arr[j]) {
                    flag = false;

                }

            }
            if (flag) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void leadersEffective(int[] arr) {
        int leader = arr[arr.length - 1];
        System.out.print(leader + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > leader) {
                System.out.print(arr[i] + " ");
                leader = arr[i];
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 6, 5, 2 };// ->10 6 5 2 //10 20 30 ->30 //30 20 10 ->30 20 10
        leaders(arr);
        System.out.println();
        leadersEffective(arr);

    }
}
