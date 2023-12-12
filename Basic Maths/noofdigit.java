public class noofdigit {

    public static int fact3(int n) {
        int product = 1;
        if (n == 1) {
            return product;
        }
        return (n * fact3(n - 1));

    }

    public static int count(int n) {
        int pro = fact3(n);
        int num = 0;
        while (pro > 0) {
            num++;
            pro = pro / 10;
        }
        return num;

    }

    public static void main(String[] args) {
        int a = count(8);
        System.out.println(a);

    }

}
