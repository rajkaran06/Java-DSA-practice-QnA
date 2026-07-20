import java.util.Scanner;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        int a = 3;
        int b = 2;

        for (int i = 0; i < n - 3; i++) {
            a += b;
            b = a - b;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();

        // Output
        int result = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);

        sc.close();
    }
}