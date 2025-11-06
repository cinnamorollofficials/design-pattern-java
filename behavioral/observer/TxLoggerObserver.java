public class TxLoggerObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("[Logger] Record event: " + event);
    }
}
