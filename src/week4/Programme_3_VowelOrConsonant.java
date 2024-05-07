package week4;
/**
 * Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_3_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        char input = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for simplicity

        if (isValidAlphabet(input)) {
            if (isVowel(input)) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Input is not a single alphabet character.");
        }

        scanner.close();
    }

    // Method to check if the input is a valid alphabet character
    public static boolean isValidAlphabet(char c) {
        return (c >= 'a' && c <= 'z');
    }

    // Method to check if the input is a vowel
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
