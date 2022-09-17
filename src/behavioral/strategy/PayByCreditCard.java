package behavioral.strategy;

public class PayByCreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount) {

        System.out.printf("Paid %s using CreditCard%n",amount);
    }
}
