public class reverseinterger {

    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = (rev * 10) + digit;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        int x = 123;

        int result = reverse(x);

        System.out.println("Reversed Number: " + result);
    }
}