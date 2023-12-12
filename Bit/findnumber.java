public class findnumber {
    public static void main(String[] args) {
   
        
       int arr[]= {1,2,4,5,6};
       int x=arr[0];
       int y=0;
       for (int i = 1; i < arr.length; i++) {
         x = x ^ arr[i];
       }

       for (int i = 1; i < 7; i++) {
         y = y ^ i;
       }
       
       

       System.out.println(x);
       System.out.println(y);
       System.out.println(x^y);
    }

}