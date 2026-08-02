import java.util.*;

public class leetcode1539 {
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int missing = arr[i] - (i + 1);

            if (missing >= k) {
                return i + k;
            }
        }

        int totalMissing = arr[arr.length - 1] - arr.length;
        int remaining = k - totalMissing;

        return arr[arr.length - 1] + remaining;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
         System.out.println("Enter size of array");
        int n = sc.nextInt();
       

        // Input array elements
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        // Input k
         System.out.println("Enter Kth element ");
        int k = sc.nextInt();
        

        // Output answer
        System.out.println(findKthPositive(arr, k));

        sc.close();
    }
}