public class BlockchainFacade {

    private Node getNode(String chain) {
        return switch (chain.toLowerCase()) {
            case "evm", "eth", "bsc", "polygon" -> new EvmNode();
            case "sol", "solana" -> new SolanaNode();
            default -> throw new RuntimeException("Unsupported chain: " + chain);
        };
    }

    public String sendNative(String chain, String from, String to, long amount, String privKey) {
        Node node = getNode(chain);
        node.connect();
        String raw = node.buildNativeTx(from, to, amount);
        String signed = node.sign(raw, privKey);
        return node.broadcast(signed);
    }
}
