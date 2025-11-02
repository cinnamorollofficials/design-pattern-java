// Concrete Product 

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public  void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}