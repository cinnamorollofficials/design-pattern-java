// Redefined Abstraction 2

public class TokenTransfer extends TransactionBridge {

    public TokenTransfer(NodeImplementor node) {
        super(node);
    }

    @Override
    public String send(String from, String to, long amountBaseUnit, String tokenOrKey) {
        String token = tokenOrKey;
        String privateKey = "priv_demo_key";
        node.connect();
        String raw = node.craftTokenTransfer(from, to, token, amountBaseUnit);
        return signAndSend(raw, privateKey);
    }
}
