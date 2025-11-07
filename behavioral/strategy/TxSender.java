public class TxSender {
    private GasStrategy strategy;

    public TxSender(GasStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(GasStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendTx(long baseGas) {
        long finalGas = strategy.calculateGas(baseGas);
        System.out.println("Sending TX with gas: " + finalGas);
    }
}
