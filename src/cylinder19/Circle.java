package cylinder19;

public class Circle {
    private double radius;

    // Constructor with parameter to initialize radius
    public Circle(double radius) {
        setRadius(radius);
    }

    // Method to set the radius, ensuring it's non-negative
    private void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area
    public double getArea() {
        return calculateArea(radius);
    }

    // Method to calculate the area
    private double calculateArea(double radius) {
        return radius * radius * Math.PI;
    }
}
