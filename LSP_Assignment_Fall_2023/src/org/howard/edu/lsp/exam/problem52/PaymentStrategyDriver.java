package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Example usage of the Strategy Pattern
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

        ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
        ShoppingCart cart2 = new ShoppingCart(payPalPayment);
        ShoppingCart cart3 = new ShoppingCart(bitcoinPayment);

        cart1.checkout(100.0);
        cart2.checkout(50.0);
        cart3.checkout(75.0);
    }
}
