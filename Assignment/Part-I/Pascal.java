import java.util.Scanner;

public class Pascal {
    public static void printPascal(int n) {
        for (int line = 0; line < n; line++) {
            int num = 1;
            for (int space = 0; space < n - line - 1; space++)
                System.out.print(" ");

            for (int i = 0; i <= line; i++) {
                System.out.print(num + " ");
                num = num * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        printPascal(rows);
        sc.close();
    }
}
