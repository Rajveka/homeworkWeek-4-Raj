package poolarea20;

public class Rectangle {
    private double width;
    private double length;

    // Constructor with parameters to initialize width and length
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    // Method to set the width, ensuring it's non-negative
    private void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to set the length, ensuring it's non-negative
    private void setLength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to get the length
    public double getLength() {
        return length;
    }

    // Method to calculate and return the area
    public double getArea() {
        return calculateArea(width, length);
    }

    // Method to calculate the area
    private double calculateArea(double width, double length) {
        return width * length;
    }
}

