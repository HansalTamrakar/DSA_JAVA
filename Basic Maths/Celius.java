public class Celius {
    public static int Celius(int n) {
        int farenhite = (int) ((9.0 / 5.0) * n + 32f);
        return farenhite;

    }

    public static void main(String[] args) {
        int b = Celius(10);
        int c = Celius(50);

        System.out.println(b + "  " + c);

    }
}