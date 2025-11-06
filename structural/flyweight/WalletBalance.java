public class WalletBalance {
    private final String walletAddress;
    private final TokenMetadata token; // shared flyweight
    private final double balance;

    public WalletBalance(String walletAddress, TokenMetadata token, double balance) {
        this.walletAddress = walletAddress;
        this.token = token;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return walletAddress + " holds " + balance + " " + token.getSymbol();
    }
}
