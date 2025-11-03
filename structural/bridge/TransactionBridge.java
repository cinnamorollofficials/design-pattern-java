// Abstraction

public abstract class TransactionBridge {
    protected final NodeImplementor node;

    protected TransactionBridge(NodeImplementor node) {
        this.node = node;
    }

    public abstract String send(String from, String to, long amountBaseUnit, String keyOrToken);

    protected String signAndSend(String rawTx, String privateKey) {
        String signed = node.sign(rawTx, privateKey);
        return node.broadcast(signed);
    }
}
