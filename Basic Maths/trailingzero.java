public class trailingzero {
    public static int countZero(int n) {
        int count = 0;

        while ((n % 10) == 0) {

            count++;

            n = n / 10;

        }
        return count;
    }

    public static void main(String[] args) {
        int a = countZero(123);
        System.out.println("Number of trailing zeroes" + a);

    }

}
