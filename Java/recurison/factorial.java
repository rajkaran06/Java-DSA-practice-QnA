package recurison;
import java.util.*;


public class factorial {

    static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}