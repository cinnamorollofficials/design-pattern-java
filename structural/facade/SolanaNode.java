public class SolanaNode implements Node {
    @Override
    public void connect() {
        System.out.println("[SOL] Connected");
    }

    @Override
    public String buildNativeTx(String from, String to, long amount) {
        return "SOL_RAW{from=" + from + ",to=" + to + ",lamports=" + amount + "}";
    }

    @Override
    public String sign(String raw, String privKey) {
        return "SOL_SIGNED(" + raw + ")";
    }

    @Override
    public String broadcast(String signed) {
        String sig = "SoL_" + Math.abs(signed.hashCode());
        System.out.println("[SOL] Broadcast -> " + sig);
        return sig;
    }
}
