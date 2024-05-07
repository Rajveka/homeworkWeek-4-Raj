package week4;

public class Programme_7_SumFirstAndLastDigit {

             // Main method to test the sumFirstAndLastDigit method
        public static void main(String[] args) {
            // Testing with different inputs
            System.out.println("sumFirstAndLastDigit(252) = " + sumFirstAndLastDigit(252)); // Expected output: 4
            System.out.println("sumFirstAndLastDigit(257) = " + sumFirstAndLastDigit(257)); // Expected output: 9
            System.out.println("sumFirstAndLastDigit(0) = " + sumFirstAndLastDigit(0)); // Expected output: 0
            System.out.println("sumFirstAndLastDigit(5) = " + sumFirstAndLastDigit(5)); // Expected output: 10
            System.out.println("sumFirstAndLastDigit(-10) = " + sumFirstAndLastDigit(-10)); // Expected output: -1
        }

        // Method to find and return the sum of the first and last digit of a number
        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1; // Invalid value, negative number
            }

            int lastDigit = number % 10;

            while (number >= 10) {
                number /= 10;
            }
            int firstDigit = number;

            return firstDigit + lastDigit;
        }
    }