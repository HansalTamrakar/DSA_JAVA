import java.util.*;

public class count {
    public static int countNum(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;

        }
        return count;

    }

    public static int countNum2(int n) {

        if (n <= 9) {
            return 1;

        }
        return (1 + countNum2(n / 10));

    }

    public static int countNum3(int n) {

        return ((int) Math.log10(n) + 1);

    }

    public static void main(String[] args) {
        int a = countNum(100000);
        int b = countNum2(100000);
        int c = countNum3(100000);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
