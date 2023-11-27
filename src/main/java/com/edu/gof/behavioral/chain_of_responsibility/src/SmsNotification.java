package com.edu.gof.behavioral.chain_of_responsibility.src;

public class SmsNotification implements NotificationManager {

    @Override
    public void send(int userId, String message) {

        System.out.printf("Sending notification via SMS to user %s with message %s%n",userId,message);
    }
}
