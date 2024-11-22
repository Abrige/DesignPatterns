package patterns.structural.facade;

public class PricingSystem {
    public double calculatePrice(String product, int quantity) {
        System.out.println("Calculating price for product: " + product + " Quantity: " + quantity);
        return 100.0;
    }
}
