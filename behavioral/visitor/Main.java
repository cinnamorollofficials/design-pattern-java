public class Main {
    public static void main(String[] args) {
        Block block = new Block(12345)
                .add(new TransferTx("0xAlice", "0xBob", 1_000_000_000_000L))
                .add(new ContractCallTx("0xBob", "0xToken", "approve", "0xSpender", "100000"))
                .add(new StakeTx("0xCarol", "Validator_1", 500_000_000L));

        // Pretty print
        PrettyPrintVisitor printer = new PrettyPrintVisitor();
        block.accept(printer);

        // Fee estimate
        FeeEstimatorVisitor fee = new FeeEstimatorVisitor();
        block.accept(fee);
        System.out.println("\nEstimated total fee (demo units): " + fee.getTotalFee());

        // Risk analysis
        RiskVisitor risk = new RiskVisitor();
        block.accept(risk);
        System.out.println("Risk score: " + risk.getRiskScore());
    }
}
