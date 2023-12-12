public class Frequency {

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 20, 20, 30, 545, 545 };
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            
            if(arr[i+1]==arr[i]){
                count=count+1;
            }
            else{
                System.out.println(count);
                count=1;
            }
            
        }
        System.out.println(count);
    }

}
