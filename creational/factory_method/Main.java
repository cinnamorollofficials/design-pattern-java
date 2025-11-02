
public  class Main {
    public static void main(String[] args) {

        NotificationFactory factory;

        // Create an Email notification using the EmailFactories
        factory = new EmailFactories();
        Notification emailNotification = factory.createNotification();
        emailNotification.send("Hello via Email!");

        // Create an SMS notification using the SMSFactories
        factory = new SMSFactories();
        Notification smsNotification = factory.createNotification();
        smsNotification.send("Hello via SMS!");
    }
}

