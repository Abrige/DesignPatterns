package patterns.structural.facade;

public class OnlineOrderFacade {

    private InventorySystem inventorySystem;
    private PricingSystem pricingSystem;
    private PaymentSystem paymentSystem;
    private OrderSystem orderSystem;
    private DiscountSystem discountSystem;

    public OnlineOrderFacade() {
        inventorySystem = new InventorySystem();
        pricingSystem = new PricingSystem();
        paymentSystem = new PaymentSystem();
        orderSystem = new OrderSystem();
        discountSystem = new DiscountSystem();
    }

    public void placeOrder(String product, int quantity, String couponCode){
        boolean isAvailable = inventorySystem.checkInventory(product, quantity);
        if(isAvailable){
            double price = pricingSystem.calculatePrice(product, quantity);
            double discount = discountSystem.applyDiscount(price, couponCode);
            paymentSystem.makePayment(price);
            orderSystem.createOrder(product, quantity);
            inventorySystem.updateInventory(product, quantity);
        }
    }
}
