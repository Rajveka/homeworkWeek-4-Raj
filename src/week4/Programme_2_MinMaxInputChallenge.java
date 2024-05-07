package week4;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */

import java.util.Scanner;

public class Programme_2_MinMaxInputChallenge {

    // Main method to execute the program
    public static void main(String[] args) {
        findMinMaxNumber();
    }

    // Method to find the minimum and maximum number entered by the user
    public static void findMinMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                System.out.println("Invalid Number. Exiting...");
                break;
            }
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        scanner.close();
    }
}