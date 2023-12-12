public class Maxdiff {
    public static int maxDiff(int[] arr) {
        int diff = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                if (diff < arr[j] - num) {
                    diff = arr[j] - num;
                }
            }

        }
        return diff;

    }

    public static int maxDiffEffective(int[] arr) {

        int maxVal = arr[1] - arr[0];
        int minNum = arr[0];
        for (int j = 1; j < arr.length; j++) {
            maxVal = Math.max(maxVal, arr[j] - minNum);
            minNum = Math.min(minNum, arr[j]);

        }
        return maxVal;

    }

    // PENDING HAI PURA NAHI HUA HAI
    public static void main(String[] args) {
        int[] arr = { 100 ,2, 3, 10, 4, 6, 8 };
        System.out.println(maxDiff(arr));
        System.out.println(maxDiffEffective(arr));
    }
}
