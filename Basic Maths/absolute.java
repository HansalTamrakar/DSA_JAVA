public class absolute {
    public static int Absolute(int n) {
        int a = n;
        if (a > 0) {
            return a;
        } else {
            a = a * -1;
            return a;
        }

    }

    public static void main(String[] args) {
        int b = Absolute(5);
        int c = Absolute(-5);
        System.out.println(b + c);

    }
}