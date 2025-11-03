// Concrete Implementor B

public class SolanaNode implements NodeImplementor {
    @Override
    public void connect() {
        System.out.println("[SOL] Connected to Solana RPC");
    }

    @Override
    public String craftNativeTransfer(String from, String to, long amountBaseUnit) {
        return "SOL_RAW_TX{native,from=" + from + ",to=" + to + ",lamports=" + amountBaseUnit + "}";
    }

    @Override
    public String craftTokenTransfer(String from, String to, String tokenAddr, long amountBaseUnit) {
        return "SOL_RAW_TX{token,from=" + from + ",to=" + to + ",token=" + tokenAddr + ",lamports=" + amountBaseUnit + "}";
    }

    @Override
    public String sign(String rawTx, String privateKey) {
        return "SOL_SIGNED(" + rawTx + ")_BY_" + privateKey.substring(0, Math.min(6, privateKey.length()));
    }

    @Override
    public String broadcast(String signedTx) {
        String txHash = "0xSOL_" + Integer.toHexString(signedTx.hashCode());
        System.out.println("[SOL] Broadcast -> " + txHash);
        return txHash;
    }

}