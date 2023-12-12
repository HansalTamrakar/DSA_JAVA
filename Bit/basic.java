public class basic {
    public static void main(String[] args) {
        int arr[] = { 9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 2, 11, 2 };
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i];

        }
        System.out.println(x);
    }
}