package partII;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("\nEnter " + (n * n) + " elements row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0, secondarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];               // Adding primary diagonal elements
            secondarySum += matrix[i][n - 1 - i];    // Adding secondary diagonal elements
        }

        System.out.println("\nResults:");
        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        sc.close();

    }
}
