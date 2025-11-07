public class UnlockedState implements WalletState {

    @Override
    public void enterPin(WalletContext ctx, String pin) {
        System.out.println("Already unlocked");
    }

    @Override
    public void sync(WalletContext ctx) {
        System.out.println("Already synced");
    }

    @Override
    public void sendTx(WalletContext ctx, String tx) {
        System.out.println("Sending TX: " + tx);
    }
}
