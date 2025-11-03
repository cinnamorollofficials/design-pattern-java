// Adaptee

public class SolanaSdk {
    public void connect(){
        System.out.println("[SOL] Connected to Solana RPC");
    }

    public void sendTransaction(byte[] raw){
        System.out.println("[SOL] SendTransaction (" + raw.length + " bytes)");
    }

    public long getBalanceLamports(String base58Address){
        System.out.println("[SOL] getBalance for: " + base58Address);
        return 2_000_000_000L; // 2 SOL (lamports; 1 SOL = 1e9 lamports)
    }
}