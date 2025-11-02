class EmailFactories extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSFactories extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}