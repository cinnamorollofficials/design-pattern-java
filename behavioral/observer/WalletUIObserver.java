public class WalletUIObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("[UI] Refresh wallet due to event: " + event);
    }
}
