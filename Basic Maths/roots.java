public class roots {
    public static void rootOfEquation(int a, int b, int c) {
        int root = (int) ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
        int root1 = (int) ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
        System.out.println(root);
        System.out.println(root1);

    }

    public static void main(String[] args) {
        int a = 1;
        int b = -13;
        int c = 30;
        rootOfEquation(a, b, c);
    }

}
