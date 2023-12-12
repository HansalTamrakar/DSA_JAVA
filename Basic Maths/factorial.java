public class factorial {
    public static int fact1(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;

        }
        return product;

    }

    public static int fact2(int n) {
        int product = 1;
        while (n > 0) {
            product = product * n;
            n--;
        }
        return product;

    }

    public static int fact3(int n) {
        int product = 1;
        if (n == 1) {
            return product;
        }
        return (n * fact3(n - 1));

    }

    public static void main(String[] args) {
        int a = fact1(8);
        int b = fact2(8);
        int c = fact3(8);
        System.out.println("Factorial of a numbe 8 is" + a);
        System.out.println("Factorial of a numbe 8 is" + b);
        System.out.println("Factorial of a numbe 8 is" + c);
    }
}
