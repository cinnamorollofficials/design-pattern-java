class SolWalletProvider implements WalletProvider {
    public void generateWallet() {
        System.out.println("[SOL] New wallet generated (SoL...)");
    }

    public void signTransaction(String txData) {
        System.out.println("[SOL] Signing tx: " + txData);
    }
}

class SolNodeProvider implements NodeProvider {
    public void connect() {
        System.out.println("[SOL] Connected to Solana RPC");
    }

    public void sendTransaction(String txHex) {
        System.out.println("[SOL] Sending raw TX: " + txHex);
    }
}
