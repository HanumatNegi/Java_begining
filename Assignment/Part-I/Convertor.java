import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer to Binary
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binary);

        // Binary to Integer
        System.out.print("Enter a binary number: ");
        String bin = sc.next();
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Decimal representation: " + decimal);

        sc.close();
    }
}
