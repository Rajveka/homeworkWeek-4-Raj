package cylinder19;

public class Cylinder extends Circle {
    private double height;

    // Constructor with parameters to initialize radius and height
    public Cylinder(double radius, double height) {
        super(radius); // Call the constructor of the parent class (Circle)
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
        return getArea() * height; // Calling getArea() from the parent class (Circle)
    }
}
