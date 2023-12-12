public class Palindrome {
    public static int reverseNumber(int n) {
        int revnum = 0, digit = 0;
        while (n > 0) {
            digit = n % 10;
            revnum = revnum * 10 + digit;
            n = n / 10;
        }
        return revnum;
    }

    public static boolean isPalindrome(int n) {
        if (reverseNumber(n) == n) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int a = reverseNumber(112211);
        boolean b = isPalindrome(a);
        System.out.println(b);
    }

}
