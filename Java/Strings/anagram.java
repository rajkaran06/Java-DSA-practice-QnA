import java.util.*;


public class anagram {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Output
        System.out.println(areAnagrams(s1, s2));

        sc.close();
    }
}
