import java.util.*;

public class prime {
    public static boolean isPrime(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;
    }

    public static boolean isPrimeOpt(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrimeOpt(14));
    }

}
