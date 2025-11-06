public class Parser {
    public static Expression parse(String rule) {
        // Example input:
        // BALANCE ETH > 1 AND BALANCE USDT >= 100

        String[] parts = rule.split(" AND ");

        Expression expr = null;
        for (String part : parts) {
            String[] tokens = part.trim().split(" ");
            // BALANCE ETH > 1
            Expression current = new BalanceExpression(tokens[1], tokens[2], Double.parseDouble(tokens[3]));

            expr = (expr == null) ? current : new AndExpression(expr, current);
        }

        return expr;
    }
}
