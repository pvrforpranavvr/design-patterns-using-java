package com.edu.gof.structural.facade;

public class PurchaseProductFacade {

    private OrderService orderService = new OrderService();
    private PaymentService paymentService = new PaymentService();
    private MailService mailService = new MailService();

    void purchaseProduct(String email, int amount, int sku) {

        orderService.orderProduct(sku, email);
        paymentService.doPayment(amount, email);
        mailService.sendMail(email, "Invoice", "product details");

    }
}
