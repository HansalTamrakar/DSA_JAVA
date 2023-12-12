import java.util.*;

public class GCD {
    public static void greatNumDivisor(int a, int b) {
        int num = 0;
        int i = 1;
        int c = Math.min(a, b);
        while (i++ < c) {
            if ((a % i == 0 && b % i == 0)) {

                num = i;

            }

        }
        System.out.println(num);

    }

    public static void greatNumDivisor1(int a, int b) {
        int num = 0;

        for (int j = 1; j <= Math.min(a, b); j++) {

            {
                if ((a % j == 0 && b % j == 0)) {

                    num = j;

                }

            }

        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        greatNumDivisor(20, 30);

    }

}
