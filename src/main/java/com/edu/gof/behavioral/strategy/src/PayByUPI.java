package com.edu.gof.behavioral.strategy.src;

public class PayByUPI implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.printf("Paid %s using UPI%n",amount);

    }
}
