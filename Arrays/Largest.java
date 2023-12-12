public class Largest {
    public static int largestValue(int[] arr){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static int minimumValue(int[] arr){
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                small = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={100,90,80,70,60,50,48,26,587,120,168};
        
        System.out.println(largestValue(arr));
        System.out.println(minimumValue(arr));
    }
}
