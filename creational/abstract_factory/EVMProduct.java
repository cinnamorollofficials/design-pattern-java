class EvmWalletProvider implements WalletProvider {
    public void generateWallet() {
        System.out.println("[EVM] New wallet generated (0x...)");
    }

    public void signTransaction(String txData) {
        System.out.println("[EVM] Signing tx: " + txData);
    }
}

class EvmNodeProvider implements NodeProvider {
    public void connect() {
        System.out.println("[EVM] Connected to EVM RPC");
    }

    public void sendTransaction(String txHex) {
        System.out.println("[EVM] Sending raw TX: " + txHex);
    }
}