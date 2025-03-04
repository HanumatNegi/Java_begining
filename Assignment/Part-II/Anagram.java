package partII;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input strings from user
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Check if anagram
        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are NOT Anagram");
        }

        sc.close();
    }
}
