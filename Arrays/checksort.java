public class checksort {
    public static boolean checkSort(int[] arr) {
        boolean key = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                key = false;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        if (checkSort(arr)) {
            System.out.println("It is a Sorted Array");

        } else {
            System.out.println("Not sorted");
        }

    }

}
