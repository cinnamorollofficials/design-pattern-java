import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String rule = "BALANCE ETH > 1 AND BALANCE USDT >= 100";

        Expression expr = Parser.parse(rule);

        Context wallet = new Context(Map.of(
                "ETH", 2.0,
                "USDT", 150.0
        ));

        boolean result = expr.interpret(wallet);
        System.out.println("Rule: " + rule);
        System.out.println("Wallet satisfies rule? " + result);
    }
}
