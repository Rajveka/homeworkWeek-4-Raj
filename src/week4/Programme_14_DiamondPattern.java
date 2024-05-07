package week4;

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        printDiamond(7); // Change the parameter to adjust the size of the diamond
    }

    public static void printDiamond(int size) {
        // Upper half of the diamond
        int spaces = size / 2;
        int stars = 1;
        int row = 1;

        while (row <= size) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();

            if (row <= size / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            row++;
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
}







