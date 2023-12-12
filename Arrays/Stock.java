public class Stock {
    public static void stock(int arr[]) {

        int minVal = arr[0];
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
            else{
                maxVal = arr[i] -minVal;
            }

        }
        System.out.println(maxVal);

    }
    public static void stockIterate(int arr[]) {

        int minVal = arr[0];
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
            else{
                maxVal = arr[i] -minVal;
            }

        }
        System.out.println(maxVal);

    }

    public static void main(String[] args) {
        int[] arr = { 35, 1, 5, 3, -42, 8, 12, 36 };
        stock(arr);
        stockIterate(arr);
    }
}

