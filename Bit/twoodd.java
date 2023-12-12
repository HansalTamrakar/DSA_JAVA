public class twoodd {
    public static void oddocc(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println(a);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 7, 8, 8 };
        oddocc(arr);

    }
}
