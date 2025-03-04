package partII;

import java.util.Scanner;
import java.util.Arrays;

public class Zeros {
    public static void moveZeroesToEnd(int[] arr) {
        int index = 0; // Pointer for the next non-zero element

        // Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the remaining array with zeroes
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        moveZeroesToEnd(arr);
        System.out.println("Modified Array: " + Arrays.toString(arr));

        sc.close();
    }
}
