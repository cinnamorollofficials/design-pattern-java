public interface EvmLikeNode {
    void connect();
    void sendRawTransaction(String txHex);
    long getBalanceWei(String evmAddress);
}