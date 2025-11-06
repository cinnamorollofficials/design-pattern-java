public class Main {
    public static void main(String[] args) {
        BlockchainFacade facade = new BlockchainFacade();

        System.out.println("=== EVM TX ===");
        facade.sendNative("evm", "0xAlice", "0xBob", 1000000000000000000L, "key1");

        System.out.println("\n=== Solana TX ===");
        facade.sendNative("solana", "AliceSoL", "BobSoL", 2000000000L, "key2");
    }
}
