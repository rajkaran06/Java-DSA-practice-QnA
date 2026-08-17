package recurison;

public class mergeSortInArray {

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        // Base case
        if (n <= 1) return;

        // Step 1: Create two arrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy elements into a and b
        int idx = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // Step 3: Recursively sort both arrays
        mergeSort(a);
        mergeSort(b);

        // Step 4: Merge a and b into arr
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {

        int i = 0; // pointer for a
        int j = 0; // pointer for b
        int k = 0; // pointer for c

        // Compare elements from both arrays
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2, 7};

        mergeSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
