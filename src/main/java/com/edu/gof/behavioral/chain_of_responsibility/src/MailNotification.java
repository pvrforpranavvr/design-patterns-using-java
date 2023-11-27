package com.edu.gof.behavioral.chain_of_responsibility.src;

public class MailNotification implements NotificationManager {

    @Override
    public void send(int userId, String message) {

        System.out.printf("Sending notification to MAIL for user %s with message %s%n",userId,message);
    }
}
