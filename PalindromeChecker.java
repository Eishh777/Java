//Write a java Program to check whether given String is Palindrome or not

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Enter a string to check if it is a palindrome:");
        String original = scanner.nextLine();

        // Remove spaces and convert to lowercase to make it case-insensitive
        String cleanedString = original.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanedString).reverse().toString();

        // Check if original and reversed strings are the same
        if (cleanedString.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
