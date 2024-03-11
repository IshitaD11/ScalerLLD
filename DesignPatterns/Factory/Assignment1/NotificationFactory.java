package ScalerLLD.DesignPatterns.Factory.Assignment1;

public class NotificationFactory {

    public static Notification getNotification(NotificationType type, String message, String recipient, String sender){
        switch(type){
            case EMAIL: return new EmailNotification( recipient, sender, message);
            case PUSH: return new PushNotification(recipient, message);
            case SMS: return new SmsNotification(recipient, message);
        }
    return null;
    }

}