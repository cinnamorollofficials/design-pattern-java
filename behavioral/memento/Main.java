public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(100);
        WalletHistory history = new WalletHistory();

        history.push(wallet.save());
        wallet.deposit(50);
        wallet.deposit(30);

        System.out.println("\nSomething goes wrong! Undo...\n");

        wallet.restore(history.pop());
    }
}
