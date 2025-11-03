public class Main {
    public static void main(String[] args) {
        String chain = (args.length > 0) ? args[0].toLowerCase() : "evm";
        BlockchainProviderFactory factory;

        if (chain.equals("evm")) {
            factory = new EvmProviderFactory();
        } else if (chain.equals("solana")) {
            factory = new SolanaProviderFactory();
        } else {
            throw new RuntimeException("Unsupported chain");
        }

        WalletProvider wallet = factory.createWalletProvider();
        NodeProvider node = factory.createNodeProvider();

        wallet.generateWallet();
        wallet.signTransaction("tx data");
        node.connect();
        node.sendTransaction("0xABC123");
    }
}
