public class maxtimesets {
    public static void main(String[] args) {

        int n = 1256;
        int prevcount = 0;
        int count = 0;
        while (n > 0) {

            if ((n & 1) != 0) {
                count++;

            }
            if ((n & 1) != 1) {
                count = 0;

            }

            if (prevcount < count) {
                prevcount = count;
            }
            n = n / 2;

        }
        System.out.println(prevcount);

    }
}
