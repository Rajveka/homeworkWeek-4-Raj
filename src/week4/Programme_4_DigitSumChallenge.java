package week4;

/**
 * . Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 */
public class Programme_4_DigitSumChallenge {
    // Main method to test the sumDigits method
    public static void main(String[] args) {
        // Testing valid values
        System.out.println("sumDigits(125) = " + sumDigits(125)); // Expected output: 8
        System.out.println("sumDigits(4567) = " + sumDigits(4567)); // Expected output: 22

        // Testing invalid values
        System.out.println("sumDigits(1) = " + sumDigits(1)); // Expected output: -1
        System.out.println("sumDigits(-125) = " + sumDigits(-125)); // Expected output: -1
        System.out.println("sumDigits(9) = " + sumDigits(9)); // Expected output: -1
    }

    // Method to compute the sum of digits of a number
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1; // Invalid value, less than 10
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }






}
