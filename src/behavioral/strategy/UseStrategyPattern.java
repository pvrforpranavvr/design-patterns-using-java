package behavioral.strategy;

public class UseStrategyPattern {

    public static final String CREDIT_CARD = "CreditCard";
    public static final String UPI = "UPI";
    public static final String PAY_PAL = "PayPal";

    public static void doPayment(String paymentMode, int amount) {

        PaymentStrategy paymentStrategy;

        switch (paymentMode) {
            case UPI:
                paymentStrategy = new PayByUPI();
                break;
            case PAY_PAL:
                paymentStrategy = new PayByPayPal();
                break;
            default:
                paymentStrategy = new PayByCreditCard();
                break;
        }

        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {

        doPayment(CREDIT_CARD, 10);
        doPayment(UPI, 10);
        doPayment(PAY_PAL, 10);
    }
}
