public interface Node {
    void connect();
    String buildNativeTx(String from, String to, long amount);
    String sign(String raw, String privKey);
    String broadcast(String signed);
}