public class Main {
    public static void main(String[] args) {
        TxSender wallet = new TxSender(new NormalGasStrategy());

        wallet.sendTx(21000);

        wallet.setStrategy(new FastGasStrategy());
        wallet.sendTx(21000);

        wallet.setStrategy(new CheapGasStrategy());
        wallet.sendTx(21000);
    }
}
