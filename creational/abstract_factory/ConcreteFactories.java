class EvmProviderFactory implements BlockchainProviderFactory {
    public WalletProvider createWalletProvider() { return new EvmWalletProvider(); }
    public NodeProvider createNodeProvider() { return new EvmNodeProvider(); }
}

class SolanaProviderFactory implements BlockchainProviderFactory {
    public WalletProvider createWalletProvider() { return new SolWalletProvider(); }
    public NodeProvider createNodeProvider() { return new SolNodeProvider(); }
}
