import java.util.Locale;


public class SolanaToEvmAdapter implements EvmLikeNode {
    private final SolanaSdk sol;

    public SolanaToEvmAdapter(SolanaSdk sol) {
        this.sol = sol;
    }

    @Override
    public void connect() {
        sol.connect();
    }

    @Override
    public void sendRawTransaction(String txHex) {
        sol.sendTransaction(hexStringToBytes(txHex));
    }

    @Override
    public long getBalanceWei(String evmAddress) {
        String base58 = evmAddressToBase58Stub(evmAddress);
        long lamports = sol.getBalanceLamports(base58);

        // Normalisasi unit (DEMO SAJA): 1 lamport -> 10_000 “wei-like”
        return lamports * 10_000L;
    }

    private static byte[] hexStringToBytes(String s) {
        s = s.startsWith("0x") ? s.substring(2) : s;
        int len = s.length();
        if (len % 2 != 0) throw new IllegalArgumentException("Hex length must be even");
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            int hi = Character.digit(s.charAt(i), 16);
            int lo = Character.digit(s.charAt(i + 1), 16);
            if (hi < 0 || lo < 0) throw new IllegalArgumentException("Invalid hex");
            data[i / 2] = (byte) ((hi << 4) + lo);
        }
        return data;
    }

    private static String evmAddressToBase58Stub(String evmAddress) {
        return ("SoL_" + evmAddress.replace("0x", "")).toUpperCase(Locale.ROOT);
    }

}