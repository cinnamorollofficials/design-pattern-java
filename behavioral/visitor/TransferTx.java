public class TransferTx implements TxElement {
    public final String from;
    public final String to;
    public final long amount;

    public TransferTx(String from, String to, long amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void accept(TxVisitor visitor) {
        visitor.visit(this);
    }
}