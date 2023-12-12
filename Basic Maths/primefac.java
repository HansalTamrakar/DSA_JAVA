import java.util.Scanner;

public class primefac {
    public static void main(String args[]) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }

    }
}

//PYTHON
// a=int(input("Enter the number"))
// b=2
// while a > 1:
//     if(a % b == 0):
//         a=a/b
//         print(b)
//     else:
//         b=b+1
