public class secondLargest {
    public static int secondLargestValue(int[] arr) {
        int seclarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            seclarge = Math.max(seclarge, arr[i]);

        }
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == seclarge) {
                continue;
            }
            lar = Math.max(lar, arr[i]);
        }

        return lar;
    }

    public static int secondSmallestValue(int[] arr) {
        int secsmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            secsmall = Math.min(secsmall, arr[i]);

        }
        
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == secsmall){
                continue;
            }
            small = Math.min(small, arr[i]);

        }
        return small;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40,50,60,70,80};
        System.out.println(secondLargestValue(arr));
        System.out.println(secondSmallestValue(arr));

    }
}
