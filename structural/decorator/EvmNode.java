public class EvmNode implements Node {
    @Override
    public void connect(){
        System.out.println("[EVM] connected to RPC");
    }

    @Override
    public String sendRawTx(String rawTx){
        System.out.println("[EVM] broadcast raw tx: "+rawTx);
        return "0XHash+"+Math.abs(rawTx.hashCode());
    }
}