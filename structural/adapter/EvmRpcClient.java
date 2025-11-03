public class EvmRpcClient implements EvmLikeNode {
   @Override
   public void connect(){
    System.out.println("[EVM] Connected to EVM RPC");
   }

   @Override
   public void sendRawTransaction(String txHex){
    System.out.println("[EVM] Sending raw TX: " + txHex);
   }

   @Override
   public long getBalanceWei(String evmAddress){
        System.out.println("[EVM] getBalance for: " + evmAddress);
        return  1_000_000_000_000_000L; // 1 ETH
   }
}