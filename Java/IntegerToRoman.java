import java.util.Scanner;

public class IntegerToRoman {

    public static String intToRoman(int num) {

        String roman = "";

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romanLetters = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                roman = roman + romanLetters[i];
                num = num - values[i];
            }
        }

        return roman;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer (1-3999): ");
        int num = sc.nextInt();

        // Output
        String result = intToRoman(num);
        System.out.println("Roman Numeral: " + result);

        sc.close();
    }
}