import java.util.Scanner;

public class isPalindrome {

    public static boolean isPalindrome(int x){


        int temp = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x /= 10;
        }

        if (rev == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);

        System.out.println(result);

        sc.close();
    }
}