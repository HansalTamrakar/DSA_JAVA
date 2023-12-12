public class poweroftwo {
    public static void main(String[] args) {
        int n = 6;
        boolean a = true;
        while (n >= 2) {
            if (n % 2 == 0) {
                System.out.println(a);
                n = n / 2;
            } else {
                System.out.println(!a);
                n = n / 2;
            }
        }
    }

}
