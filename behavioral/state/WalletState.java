public interface WalletState {
    void enterPin(WalletContext ctx, String pin);
    void sync(WalletContext ctx);
    void sendTx(WalletContext ctx, String tx);
}
