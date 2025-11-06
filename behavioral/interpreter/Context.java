import java.util.Map;

public class Context {
    private final Map<String, Double> balances;

    public Context(Map<String, Double> balances) {
        this.balances = balances;
    }

    public Double getBalance(String token) {
        return balances.getOrDefault(token, 0.0);
    }
}
