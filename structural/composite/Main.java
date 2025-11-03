public class Main {
    public static void main(String[] args) {
        WalletComposite portfolio = new WalletComposite("My Portfolio");

        WalletComposite evmWallet = new WalletComposite("EVM Wallet");
        evmWallet.add(new TokenHolding("ETH", 1.5, 1800));    // $2700
        evmWallet.add(new TokenHolding("USDT", 1000, 1));     // $1000

        WalletComposite solWallet = new WalletComposite("Solana Wallet");
        solWallet.add(new TokenHolding("SOL", 20, 35));       // $700
        solWallet.add(new TokenHolding("USDC", 500, 1));      // $500

        portfolio.add(evmWallet);
        portfolio.add(solWallet);

        System.out.println("=== Portfolio Breakdown ===");
        portfolio.print("");

        System.out.println("\nTotal Portfolio Value: $" + portfolio.getValueInUsd());
    }
}
