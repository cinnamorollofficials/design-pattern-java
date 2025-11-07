public class Main {
    public static void main(String[] args) {
        TransactionTemplate evm = new EvmTransaction();
        TransactionTemplate sol = new SolanaTransaction();

        System.out.println("=== EVM Native Transfer ===");
        String evmHash = evm.send("0xAlice", "0xBob", 1_000_000_000_000_000_000L, "priv_evm_key");
        System.out.println("EVM Tx Hash: " + evmHash);

        System.out.println("\n=== Solana Native Transfer ===");
        String solSig = sol.send("AliceSoL", "BobSoL", 2_000_000_000L, "priv_sol_key");
        System.out.println("Solana Sig: " + solSig);
    }
}
