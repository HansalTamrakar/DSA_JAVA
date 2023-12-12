public class totalbitdiff {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int count = 0;
        while (a > 0 || b > 0) {
            int y = a & 1;
            if (y != (b & 1)) {
                count++;
            }
            a = a / 2;
            b = b / 2;

        }
        System.out.println(count);
    }

}
