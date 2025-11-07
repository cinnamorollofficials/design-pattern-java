public class SyncingState implements WalletState {

    @Override
    public void enterPin(WalletContext ctx, String pin) {
        System.out.println("Already unlocked, syncing...");
    }

    @Override
    public void sync(WalletContext ctx) {
        System.out.println("Syncing wallet with blockchain...");
        ctx.setState(new UnlockedState());
        System.out.println("Sync complete!");
    }

    @Override
    public void sendTx(WalletContext ctx, String tx) {
        System.out.println("Cannot send TX, still syncing");
    }
}
