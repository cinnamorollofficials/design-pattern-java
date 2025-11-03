interface BlockchainProviderFactory {
    WalletProvider createWalletProvider();
    NodeProvider createNodeProvider();
}
