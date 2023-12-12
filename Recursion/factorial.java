
public class factorial {
    public static int factoriall(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factoriall(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(factoriall(8));

    }
}
