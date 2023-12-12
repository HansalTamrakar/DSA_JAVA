public class bitdiff {

    public static void main(String[] args) {
        int n = 18;
        int m = 20;
        int count = 0;
        while (n > 0) {
            int y = (n & 1);
            if (y != (m & 1)) {

                count++;
            }

            n = n / 2;
            m = m / 2;
        }
        System.out.println(count);
    }

}
