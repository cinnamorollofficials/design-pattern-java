public class SolanaTransaction extends TransactionTemplate {

    @Override
    protected void connect() {
        System.out.println("[SOL] Connected to RPC");
    }

    @Override
    protected void preValidate(String from, String to, long amount) {
        if (from.isBlank() || to.isBlank()) throw new IllegalArgumentException("[SOL] Address required");
        if (amount <= 0) throw new IllegalArgumentException("[SOL] Amount must be > 0");
        System.out.println("[SOL] Pre-validate OK");
    }

    @Override
    protected String build(String from, String to, long amount) {
        String raw = "SOL_RAW{from=" + from + ",to=" + to + ",lamports=" + amount + "}";
        System.out.println("[SOL] Build raw tx: " + raw);
        return raw;
    }

    @Override
    protected long estimateFee(String rawTx) {
        // demo: flat fee lamports
        return 5_000L;
    }

    @Override
    protected String sign(String rawTx, String privateKey) {
        String signed = "SOL_SIGNED(" + rawTx + ")_BY_" + privateKey.substring(0, Math.min(6, privateKey.length()));
        System.out.println("[SOL] Sign tx");
        return signed;
    }

    @Override
    protected String broadcast(String signedTx) {
        String sig = "SoL_" + Math.abs(signedTx.hashCode());
        System.out.println("[SOL] Broadcast -> " + sig);
        return sig;
    }

    @Override
    protected void postBroadcast(String txHash) {
        System.out.println("[SOL] Confirming signature: " + txHash + " (demo)");
    }
}
