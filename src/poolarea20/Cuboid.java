package poolarea20;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor with parameters to initialize width, length, and height
    public Cuboid(double width, double length, double height) {
        super(width, length); // Call the constructor of the parent class (Rectangle)
        setHeight(height);
    }

    // Method to set the height, ensuring it's non-negative
    private void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume
    public double getVolume() {
        return getArea() * height; // Calling getArea() from the parent class (Rectangle)
    }
}
