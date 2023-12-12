public class poewertwo {
    public static boolean power(int n) {
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;

        }
        return true;

    }

    public static void main(String[] args) {

        int n = 18;

        boolean a = power(n);
        System.out.println(a);

    }

}
