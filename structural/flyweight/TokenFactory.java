import java.util.HashMap;
import java.util.Map;

public class TokenFactory {
    private static final Map<String, TokenMetadata> cache = new HashMap<>();

    public static TokenMetadata getToken(String symbol) {
        if (cache.containsKey(symbol)) {
            return cache.get(symbol);
        }

        // In real case: fetch metadata from chain or API
        TokenMetadata meta = switch (symbol) {
            case "ETH" -> new TokenMetadata("ETH", "Ethereum", 18, "eth.png");
            case "USDT" -> new TokenMetadata("USDT", "Tether USD", 6, "usdt.png");
            case "SOL" -> new TokenMetadata("SOL", "Solana", 9, "sol.png");
            default -> throw new RuntimeException("Unknown token: " + symbol);
        };

        cache.put(symbol, meta);
        return meta;
    }
}
