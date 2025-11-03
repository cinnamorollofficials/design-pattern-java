public class Main {
    public static void main(String[] args) {
        String chain = (args.length > 0) ? args[0].toLowerCase() : "evm";

        EvmLikeNode node;
        switch(chain) {
            case "sol":
            case "solana":
                node = new SolanaToEvmAdapter(new SolanaSdk());
                break;
            case "evm":
            case "ethereum":
            default:
                node = new EvmRpcClient();
        }

        node.connect();
        node.sendRawTransaction("0xABC123");
        long balanceWei = node.getBalanceWei(
            chain.equals("sol") || chain.equals("solana") ? "0xabc123" : "0x1111222233334444"
        );
        System.out.println("Unified balance (wei like): " + balanceWei);
    }
}