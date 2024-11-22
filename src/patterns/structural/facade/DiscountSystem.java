package patterns.structural.facade;

public class DiscountSystem {

    public double applyDiscount(double price, String couponCode) {
        System.out.println("Applying discount of: " + price + " with coupon code: " + couponCode);
        return price * 0.9;
    }
}
