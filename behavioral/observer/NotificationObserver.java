public class NotificationObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("[Notify] Push notification: " + event);
    }
}
