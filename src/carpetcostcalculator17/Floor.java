package carpetcostcalculator17;

public class Floor {
    private double width;
    private double length;

    // Constructor with parameters to initialize width and length
    public Floor(double width, double length) {
        // Ensure width and length are non-negative
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Method to calculate and return the area of the floor
    public double getArea() {
        return width * length;
    }
}
