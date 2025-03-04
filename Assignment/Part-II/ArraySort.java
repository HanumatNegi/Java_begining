package partII;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (n x m): ");
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.print("\nEnter column to sort by: ");
        int col = sc.nextInt();

        Arrays.sort(matrix, (a, b) -> Integer.compare(a[col], b[col]));

        // Print sorted matrix
        System.out.println("\nSorted Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}
