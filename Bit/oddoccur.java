public class oddoccur {
    public static void oddocc(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count % 2 != 0) {
                System.out.println(a);
            }

        }

    }

    public static int oddocc1(int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i] ^ x;

        }
        return x;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 7, 8, 8, 8, 3 };
        oddocc(arr);

    }
}
