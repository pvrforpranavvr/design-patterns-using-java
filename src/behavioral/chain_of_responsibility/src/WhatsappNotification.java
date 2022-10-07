package behavioral.chain_of_responsibility.src;

public class WhatsappNotification implements NotificationManager {

    @Override
    public void send(int userId, String message) {

        System.out.printf("Sending notification to WHATSAPP to user %s with message %s%n", userId, message);
    }
}
