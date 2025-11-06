public class  EvmNode implements Node {
    @Override
    public void connect(){
        System.out.println("[EVM] connected.");
    }

    @Override
    public String buildNativeTx(String from, String to, long amount){
        return "EVM_RAW{from=" + from + ",to=" + to + ",wei=" + amount + "}";
    }

    @Override
    public String sign(String raw, String privKey){
        return "EVM_SIGNED(" + raw + ")";
    }

    @Override
    public String broadcast(String signed) {
        String hash = "0xEVM_" + Math.abs(signed.hashCode());
        System.out.println("[EVM] Broadcast -> " + hash);
        return hash;
    }
}