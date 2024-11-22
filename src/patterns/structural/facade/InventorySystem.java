package patterns.structural.facade;

public class InventorySystem {
    public void updateInventory(String productId, int quantity) {
        System.out.println("Product ID: " + productId + " Quantity: " + quantity);
    }

    public boolean checkInventory(String product, int quantity) {
        System.out.println("Checking inventory for product: " + product + " Quantity: " + quantity);
        return true;
    }
}
