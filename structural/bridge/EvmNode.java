// Concrete Implementor A

public class EvmNode implements NodeImplementor {
    @Override
    public void connect() {
        System.out.println("[EVM] Connected to EVM RPC");
    }

    @Override
    public String craftNativeTransfer(String from, String to, long amountBaseUnit) {
       return "EVM_RAW_TX{native,from=" + from + ",to=" + to + ",wei=" + amountBaseUnit + "}";
    }

    @Override
    public String craftTokenTransfer(String from, String to, String tokenAddr, long amountBaseUnit) {
        return "EVM_RAW_TX{erc20,from=" + from + ",to=" + to + ",token=" + tokenAddr + ",wei=" + amountBaseUnit + "}";
    }

    @Override
    public String sign(String rawTx, String privateKey) {
        return "EVM_SIGNED(" + rawTx + ")_BY_" + privateKey.substring(0, Math.min(6, privateKey.length()));
    }

    @Override
    public String broadcast(String signedTx) {
        String txHash = "0xEVM_" + Integer.toHexString(signedTx.hashCode());
        System.out.println("[EVM] Broadcast -> " + txHash);
        return txHash;
    }

}