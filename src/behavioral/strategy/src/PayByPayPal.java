package behavioral.strategy.src;

public class PayByPayPal implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.printf("Paid %s using PayPal%n",amount);

    }
}
