package recurison;
import java.util.*;

public class firstOccurenceUsingRecursion {

    public static int firstOccurrence(int[] arr, int target, int index) {

        // Target not found
        if (index == arr.length) {
            return -1;
        }

        // First match found
        if (arr[index] == target) {
            return index;
        }

        return firstOccurrence(arr, target, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 System.out.println("element to be searched:");
        int target = sc.nextInt();

        System.out.println(firstOccurrence(arr, target, 0));

        sc.close();
    }
}
