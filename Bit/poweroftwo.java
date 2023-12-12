public class poweroftwo {
    public static boolean power(int n) {

        while (n != 1) {
            if (n % 2 != 0) {
                return false;

            }
            n = n / 2;

        }
        return true;

    }

    public static boolean bools(int n) {

        if ((n & (n - 1)) == 0) {
            {
                return true;

            }

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(power(12));
        System.out.println(bools(8));

    }

}
