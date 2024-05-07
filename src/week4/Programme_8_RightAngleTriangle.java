package week4;

public class Programme_8_RightAngleTriangle {
    // Main method to execute the program
    public static void main(String[] args) {
        displayRightAngleTriangle(4); // Example: Display a triangle with 5 rows
    }

    // Method to display a right-angle triangle of "@" symbols
    public static void displayRightAngleTriangle(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop for the rows
            for (int j = 1; j <= i; j++) { // Loop for printing "@" symbols in each row
                System.out.print("@");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }






}
