package behavioral.chain_of_responsibility.src;

import java.util.List;

public class NotificationChainResponsibilityClient {


    private List<NotificationManager> getChainOfNotification() {

        return List.of(new MailNotification(),
                new SmsNotification(),
                new WhatsappNotification());
    }

    public static void main(String[] args) {


        NotificationChainResponsibilityClient client = new NotificationChainResponsibilityClient();

        for (NotificationManager notificationManager : client.getChainOfNotification()) {

            notificationManager.send(1, "Happy Birthday");
        }
    }
}
