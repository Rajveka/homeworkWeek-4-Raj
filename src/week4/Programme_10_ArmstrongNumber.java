package week4;

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int remainder;
        int n = String.valueOf(number).length();

        while (number != 0) {
            remainder = number % 10;
            result += Math.pow(remainder, n);
            number /= 10;
        }

        return result == originalNumber;
    }
}
