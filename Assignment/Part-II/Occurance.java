package partII;

import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
    public static int[] removeOccurrences(int[] arr, int key) {
        return Arrays.stream(arr)
                .filter(num -> num != key)
                .toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take key element from user
        System.out.print("Enter the element to remove: ");
        int key = sc.nextInt();

        // Call function to remove occurrences of key
        int[] result = removeOccurrences(arr, key);

        // Print the result
        System.out.println("Array after removing occurrences of " + key + ": " + Arrays.toString(result));

        sc.close();
    }
}
