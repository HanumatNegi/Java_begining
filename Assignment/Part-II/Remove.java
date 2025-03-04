package partII;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Remove {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
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

        // Call function to remove duplicates
        int[] result = removeDuplicates(arr);

        // Print the result
        System.out.println("Array without duplicates: " + Arrays.toString(result));

        sc.close();
    }
}
