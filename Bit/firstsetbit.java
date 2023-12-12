public class firstsetbit {
    public static void main(String[] args) {
        int n = 18;
        int count = 1;
        while (n > 0) {

            if ((n & 1) == 1) {
                System.out.println(count);
            }
            count++;
            n = n / 2;
        }
    }

}
