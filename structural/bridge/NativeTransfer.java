// Redefined Abstraction 1

public class NativeTransfer extends TransactionBridge {

    public NativeTransfer(NodeImplementor node) {
        super(node);
    }

    @Override
    public String send(String from, String to, long amountBaseUnit, String privateKey) {
        node.connect();
        String raw = node.craftNativeTransfer(from, to, amountBaseUnit);
        return signAndSend(raw, privateKey);
    }
}