package recurison;

import java.util.*;

public class binarySearch {

    public static int helper(int[] nums, int target, int left, int right) {

        // Element not found
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } 
        else if (nums[mid] > target) {
            return helper(nums, target, left, mid - 1);
        } 
        else {
            return helper(nums, target, mid + 1, right);
        }
    }

    public static int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("element to be searched:");
        int target = sc.nextInt();

        System.out.println("The element is found at index: "+search(nums, target));

        sc.close();
    }
}