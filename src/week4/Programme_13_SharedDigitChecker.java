package week4;

public class Programme_13_SharedDigitChecker {

    // Main method to test the hasSharedDigit method
    public static void main(String[] args) {
        // Testing with different inputs
        System.out.println("hasSharedDigit(12, 23) = " + hasSharedDigit(12, 23)); // Expected output: true
        System.out.println("hasSharedDigit(9, 99) = " + hasSharedDigit(9, 99)); // Expected output: false
        System.out.println("hasSharedDigit(15, 55) = " + hasSharedDigit(15, 55)); // Expected output: true
    }

    // Method to check if two numbers have a shared digit
    public static boolean hasSharedDigit(int num1, int num2) {
        if (!isValidRange(num1) || !isValidRange(num2)) {
            return false;
        }

        int digit1;
        int digit2;

        while (num1 > 0) {
            digit1 = num1 % 10;
            int temp = num2;
            while (temp > 0) {
                digit2 = temp % 10;
                if (digit1 == digit2) {
                    return true;
                }
                temp /= 10;
            }
            num1 /= 10;
        }
        return false;
    }

    // Method to check if a number is within the range of 10 (inclusive) - 99 (inclusive)
    public static boolean isValidRange(int number) {
        return number >= 10 && number <= 99;
    }
}

