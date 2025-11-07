public abstract class TransactionTemplate {

    // Template Method: urutan langkah bersifat final (tidak boleh diubah client)
    public final String send(String from, String to, long amount, String privateKey) {
        connect();
        preValidate(from, to, amount);
        String raw = build(from, to, amount);
        long fee = estimateFee(raw);
        onFeeReady(fee);
        String signed = sign(raw, privateKey);
        String hash = broadcast(signed);
        postBroadcast(hash);
        return hash;
    }

    // --- Primitive Operations (WAJIB di-override oleh subclass) ---
    protected abstract void connect();
    protected abstract void preValidate(String from, String to, long amount);
    protected abstract String build(String from, String to, long amount);
    protected abstract long estimateFee(String rawTx);
    protected abstract String sign(String rawTx, String privateKey);
    protected abstract String broadcast(String signedTx);

    // --- Hook Methods (opsional di-override) ---
    protected void onFeeReady(long fee) {
        System.out.println("[TEMPLATE] Estimated fee: " + fee);
    }

    protected void postBroadcast(String txHash) {
        System.out.println("[TEMPLATE] Broadcast done: " + txHash);
    }
}
