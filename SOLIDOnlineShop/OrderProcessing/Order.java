
package SOLIDOnlineShop.OrderProcessing;

import SOLIDOnlineShop.Payment.PaymentMethod;
import SOLIDOnlineShop.Application.Cart;

public class Order {
    private Cart cart;
    private PaymentMethod paymentMethod;

    public Order(Cart cart, PaymentMethod paymentMethod) {
        this.cart = cart;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(OrderProcessor orderProcessor) {
        // Process order, calculate total, etc.

        orderProcessor.processOrder(this);

        System.out.println("Order processed!");
        paymentMethod.processPayment(cart.getTotalPrice());
    }
}
