package week4;

public class Programme_9_FibonacciSequence {

        // Main method to execute the program
        public static void main(String[] args) {
            int limit = 8; // Change this value to print the sequence up to a different limit
            printFibonacciSequence(limit);
        }

        // Method to print the Fibonacci sequence up to a given limit
        public static void printFibonacciSequence(int limit) {
            int firstNumber = 1;
            int secondNumber = 1;
            int nextNumber;

            System.out.print(firstNumber + " " + secondNumber + " ");

            for (int i = 2; i < limit; i++) {
                nextNumber = firstNumber + secondNumber;
                System.out.print(nextNumber + " ");
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
}