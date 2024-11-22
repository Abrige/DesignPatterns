package patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        OnlineOrderFacade onlineOrderFacade = new OnlineOrderFacade();

        String product = "Smartphone";
        int quantity = 3;
        String couponCode = "SALE10";

        onlineOrderFacade.placeOrder(product, quantity, couponCode);
    }
}
