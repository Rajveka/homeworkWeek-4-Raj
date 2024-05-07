package week4;

public class Programme_11_EvenDigitSumCalculator {

    // Main method to test the getEvenDigitSum method
    public static void main(String[] args) {
        // Testing with different inputs
        System.out.println("getEvenDigitSum(123456789) = " + getEvenDigitSum(123456789)); // Expected output: 20
        System.out.println("getEvenDigitSum(252) = " + getEvenDigitSum(252)); // Expected output: 4
        System.out.println("getEvenDigitSum(-22) = " + getEvenDigitSum(-22)); // Expected output: -1
    }

    // Method to get the sum of even digits within a number
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Invalid value, negative number
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }
}
