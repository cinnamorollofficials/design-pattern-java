interface WalletProvider {
    void generateWallet();
    void signTransaction(String txHex);
}

interface NodeProvider {
    void connect();
    void sendTransaction(String txHex);
}