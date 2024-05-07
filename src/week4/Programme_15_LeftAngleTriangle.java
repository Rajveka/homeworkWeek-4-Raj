package week4;

public class Programme_15_LeftAngleTriangle {

    public static void main(String[] args) {
        int rows = 5; // Change the value to adjust the number of rows in the triangle
        printLeftAngleTriangle(rows);
    }

    public static void printLeftAngleTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
