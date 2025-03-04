package partII;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];

        // Shift elements
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }

        System.out.println("Rotated Array: " + Arrays.toString(temp));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int d = sc.nextInt();

        rotateArray(arr, d);

        sc.close();
    }
}
