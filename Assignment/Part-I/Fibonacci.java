import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSum(int n) {
        int a = 0, b = 1, sum = 0;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // Print Fibonacci number before summing
            sum += a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(); // Move to next line after printing series
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int totalSum = fibonacciSum(n);
        System.out.println("Sum of Fibonacci Series: " + totalSum);
        sc.close();
    }
}
