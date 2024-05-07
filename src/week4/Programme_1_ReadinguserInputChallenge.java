package week4;
/**
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */

import java.util.Scanner;

public class Programme_1_ReadinguserInputChallenge {

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = readAndSumNumbers(scanner);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }

    // Method to read 10 numbers from the console and return their sum
    public static int readAndSumNumbers(Scanner scanner) {
        int sum = 0;
        int count = 1;

        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
                scanner.next(); // discard the invalid input
            }
        }

        return sum;
    }
}
