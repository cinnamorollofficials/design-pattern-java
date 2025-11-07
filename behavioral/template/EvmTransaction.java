public class EvmTransaction extends TransactionTemplate {

    @Override
    protected void connect() {
        System.out.println("[EVM] Connected to RPC");
    }

    @Override
    protected void preValidate(String from, String to, long amount) {
        if (!from.startsWith("0x") || !to.startsWith("0x")) {
            throw new IllegalArgumentException("[EVM] Invalid address format");
        }
        if (amount <= 0) throw new IllegalArgumentException("[EVM] Amount must be > 0");
        System.out.println("[EVM] Pre-validate OK");
    }

    @Override
    protected String build(String from, String to, long amount) {
        String raw = "EVM_RAW{from=" + from + ",to=" + to + ",wei=" + amount + "}";
        System.out.println("[EVM] Build raw tx: " + raw);
        return raw;
    }

    @Override
    protected long estimateFee(String rawTx) {
        // demo: 21_000 gas * 20 gwei (disederhanakan)
        long fee = 21_000L * 20L;
        return fee;
    }

    @Override
    protected String sign(String rawTx, String privateKey) {
        String signed = "EVM_SIGNED(" + rawTx + ")_BY_" + privateKey.substring(0, Math.min(6, privateKey.length()));
        System.out.println("[EVM] Sign tx");
        return signed;
    }

    @Override
    protected String broadcast(String signedTx) {
        String hash = "0xEVM_" + Integer.toHexString(signedTx.hashCode());
        System.out.println("[EVM] Broadcast -> " + hash);
        return hash;
    }

    @Override
    protected void onFeeReady(long fee) {
        System.out.println("[EVM] Fee (gas*gwei): " + fee);
    }
}
