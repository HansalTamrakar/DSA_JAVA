public class consecutiveset {
    public static void main(String[] args) {
        int b = 10;
        int a = 0;
        while (b > 0) {
            if ((b & 1) == 1 && ((b >> 1) & 1) == 1) {
                a = 1;
            }

            b = b / 2;
        }
        System.out.println(a);
    }
}
