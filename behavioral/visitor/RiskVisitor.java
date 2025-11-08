// Concrete Visitor #3


public class RiskVisitor implements TxVisitor {
    private int riskScore = 0;

    @Override
    public void visit(TransferTx tx) {
        if (tx.amount > 1_000_000_000_000L) riskScore += 5; // demo
    }

    @Override
    public void visit(ContractCallTx tx) {
        if ("approve".equalsIgnoreCase(tx.method)) riskScore += 7; // approve sering berisiko
    }

    @Override
    public void visit(StakeTx tx) {
        // staking cenderung aman
        riskScore += 1;
    }

    @Override
    public void visit(Block block) {
        // no-op
    }

    public int getRiskScore() {
        return riskScore;
    }
}
