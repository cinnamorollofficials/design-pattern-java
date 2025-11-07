public class Main {
    public static void main(String[] args) {
        WalletContext wallet = new WalletContext(new LockedState());

        wallet.sendTx("0xabc");      // cannot send
        wallet.sync();               // cannot sync

        wallet.enterPin("9999");     // wrong PIN
        wallet.enterPin("1234");     // unlock -> syncing

        wallet.sendTx("0xabc");      // cannot send
        wallet.sync();               // sync -> unlocked

        wallet.sendTx("0xabc");      // can send now!
    }
}
