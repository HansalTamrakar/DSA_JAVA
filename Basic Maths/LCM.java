public class LCM {
    public static void printLCM(int a, int b) {
        int lcm = 0;
        int c = Math.max(a, b);
        int i = 21;
        while (i >= c) {

            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                return;

            }
            i = i + 1;

        }

    }

    public static void main(String[] args) {
        printLCM(20, 10);

    }

}
