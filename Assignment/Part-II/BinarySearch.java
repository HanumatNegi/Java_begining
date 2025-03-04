package partII;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take key to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Perform Binary Search
        int result = binarySearch(arr, key);

        // Print result
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }
}
