package partII;

import java.util.Scanner;

public class LeadingZero{
    public static String removeLeadingZeros(String str) {
        return str.replaceFirst("^0+", ""); // Remove leading zeros
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number with leading zeros: ");
        String number = sc.next();

        // Remove leading zeros
        String result = removeLeadingZeros(number);

        // Print the result
        System.out.println("Number without leading zeros: " + result);

        sc.close();
    }
}
