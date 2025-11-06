public class RealEvmNode implements Node {
    private boolean connected = false;

    @Override
    public void connect() {
        System.out.println("[EVM] Connecting to real RPC...");
        connected = true;
    }

    @Override
    public String sendTx(String raw) {
        if (!connected) throw new RuntimeException("Not connected!");
        System.out.println("[EVM] Broadcasting TX: " + raw);
        return "0xHASH_" + Math.abs(raw.hashCode());
    }
}
