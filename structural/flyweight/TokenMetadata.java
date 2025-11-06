public class TokenMetadata {
    private final String symbol;
    private final String name;
    private final int decimals;
    private final String logoUrl;

    public TokenMetadata(String symbol, String name, int decimals, String logoUrl) {
        this.symbol = symbol;
        this.name = name;
        this.decimals = decimals;
        this.logoUrl = logoUrl;
    }

    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public int getDecimals() { return decimals; }

    @Override
    public String toString() {
        return symbol + " (" + name + ", decimals=" + decimals + ")";
    }
}
