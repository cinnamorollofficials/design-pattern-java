// Implementor

public interface NodeImplementor {
    void connect();
    String craftNativeTransfer(String from, String to, long amountBaseUnit);
    String craftTokenTransfer(String from, String to, String tokenIdOrAddr, long amountBaseUnit);
    String sign(String rawTx, String privateKey);
    String broadcast(String signedTx);
}