package partII;

import java.util.Scanner;

public class MatrixSpiral{
    public static void spiralPrint(int[][] matrix, int n, int m) {
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }

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

        System.out.print("Spiral order: ");
        spiralPrint(matrix, n, m);

        sc.close();
    }
}
