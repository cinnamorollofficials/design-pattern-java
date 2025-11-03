public class Main {
    public static void main(String[] args) {
        // args: [chain, kind, from, to, amount, extra]
        // chain: evm | solana
        // kind : native | token
        // amount: base unit (wei/lamports)
        // extra: privateKey (native) atau tokenAddrOrMint (token)

        String chain  = args.length > 0 ? args[0].toLowerCase() : "evm";
        String kind   = args.length > 1 ? args[1].toLowerCase() : "native";
        String from   = args.length > 2 ? args[2] : "addr_from";
        String to     = args.length > 3 ? args[3] : "addr_to";
        long amount   = args.length > 4 ? Long.parseLong(args[4]) : 1000L;
        String extra  = args.length > 5 ? args[5] : (kind.equals("native") ? "priv_key" : "token_id");

        NodeImplementor impl =
                switch (chain) {
                    case "sol", "solana" -> new SolanaNode();
                    case "evm", "eth", "polygon", "bsc" -> new EvmNode();
                    default -> throw new IllegalArgumentException("Unsupported chain: " + chain);
                };

        TransactionBridge tx =
                switch (kind) {
                    case "token" -> new TokenTransfer(impl);
                    case "native" -> new NativeTransfer(impl);
                    default -> throw new IllegalArgumentException("Unsupported kind: " + kind);
                };

        String result = tx.send(from, to, amount, extra);
        System.out.println("Tx Result: " + result);
    }
}
