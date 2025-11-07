public class LockedState implements WalletState {

    @Override
    public void enterPin(WalletContext ctx, String pin) {
        if (pin.equals("1234")) {
            System.out.println("🔓 Wallet unlocked");
            ctx.setState(new SyncingState());
        } else {
            System.out.println("Wrong PIN");
        }
    }

    @Override
    public void sync(WalletContext ctx) {
        System.out.println("Cannot sync, wallet locked");
    }

    @Override
    public void sendTx(WalletContext ctx, String tx) {
        System.out.println("Cannot send TX, wallet locked");
    }
}
