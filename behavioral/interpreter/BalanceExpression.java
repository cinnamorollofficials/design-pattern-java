public class BalanceExpression implements Expression {
    private final String token;
    private final String operator;
    private final double value;

    public BalanceExpression(String token, String operator, double value) {
        this.token = token;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        double bal = context.getBalance(token);

        return switch (operator) {
            case ">"  -> bal > value;
            case "<"  -> bal < value;
            case ">=" -> bal >= value;
            case "<=" -> bal <= value;
            default   -> throw new RuntimeException("Unknown operator " + operator);
        };
    }
}
