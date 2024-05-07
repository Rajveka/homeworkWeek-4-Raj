package carpetcostcalculator17;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    // Constructor with parameters to initialize floor and carpet
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method to calculate and return the total cost
    public double getTotalCost() {
        // Calculate the total cost by multiplying the area of the floor by the cost per square unit of the carpet
        return floor.getArea() * carpet.getCost();
    }
}
