public class setbit {
    public static int countSet(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;

    }

    public static int countSett(int n) {
        int count = 0;
        while (n > 0) {
            if ((n % 2) == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;

    }

    public static void main(String[] args) {
        int a = countSet(8);
        int b = countSett(8);
        System.out.println(a);
        System.out.println(b);

    }

}
