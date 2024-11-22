package patterns.structural.facade;

public class OrderSystem {
    public void createOrder(String product, int quantity) {
        System.out.println("Creating order for product: " + product + " Quantity: " + quantity);
    }
}
