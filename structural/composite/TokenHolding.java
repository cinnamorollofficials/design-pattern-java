public class TokenHolding implements PortfolioComponent {
    private final String token;
    private final double amount;
    private final double priceUsd;


    public TokenHolding(String token, double amount, double priceUsd) {
        this.token = token;
        this.amount = amount;
        this.priceUsd = priceUsd;
    }

    @Override
    public long getValueInUsd() {
       return Math.round(amount * priceUsd);
    }

   @Override
    public void print(String indent) {
        System.out.println(indent + "- " + token + ": $" + getValueInUsd());
    }
}