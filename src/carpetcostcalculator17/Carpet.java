package carpetcostcalculator17;

public class Carpet {
    private double cost;

    // Constructor with parameter to initialize cost
    public Carpet(double cost) {
        setCost(cost);
    }

    // Method to set the cost, ensuring it's non-negative
    private void setCost(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // Method to get the cost
    public double getCost() {
        return cost;
    }
}
