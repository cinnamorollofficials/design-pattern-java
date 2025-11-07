public class WalletContext {
    private WalletState state;

    public WalletContext(WalletState initialState) {
        this.state = initialState;
    }

    public void setState(WalletState state) {
        System.out.println("Switching state to: " + state.getClass().getSimpleName());
        this.state = state;
    }

    public void enterPin(String pin)   { state.enterPin(this, pin); }
    public void sync()                 { state.sync(this); }
    public void sendTx(String tx)      { state.sendTx(this, tx); }
}
