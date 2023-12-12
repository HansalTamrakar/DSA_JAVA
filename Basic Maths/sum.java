public class sum {
    public static int sum1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum = sum + i;

        }
        return sum;

    }

    public static int sum2(int n) {
        int sum = 0;
        sum = n * (n + 1) / 2;
        return sum;

    }

    public static int sum3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;

            }
        }
        return sum;

    }

    public static int sum4(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int sum5(int n) {
        int sum = 0;
        if (n == 0) {
            return sum;
        }
        return (n + sum5(n - 1));

    }

    public static void main(String[] args) {
        int a = sum1(6);
        int b = sum2(6);
        int c = sum3(6);
        System.out.println("Enter the Number of Array");
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int d = sum4(arr);
        int e = sum5(6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}