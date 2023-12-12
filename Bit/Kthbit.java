public class Kthbit {
    public static void rightShift(int n, int k) {
        if (((n >> (k - 1)) & 1) == 1) {
            System.out.println("The Kth bit is 1");

        } else {
            System.out.println("The Kth bit is 0");
        }
    }

    public static void leftShift(int n, int k) {
        if ((n & (1 << (k - 1))) == 0) {
            System.out.println("The Kth bit is 0");

        } else {
            System.out.println("The Kth bit is 1");
        }
    }

    public static void main(String[] args) {
        // rightShift(8, 4);
        // leftShift(8, 4);
        leftShift(23, 1);
        leftShift(23, 2);
        leftShift(23, 3);
        leftShift(23, 4);
        leftShift(23, 5);
        leftShift(23, 6);
    }
}
