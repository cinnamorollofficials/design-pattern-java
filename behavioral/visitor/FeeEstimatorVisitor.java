// Concrete Visitor #2

public class FeeEstimatorVisitor implements TxVisitor {
    private long totalFee = 0;

    @Override
    public void visit(TransferTx tx) {
        totalFee += 21_000;
    }

    @Override
    public void visit(ContractCallTx tx) {
        totalFee += 100_000 + (tx.args.length * 5_000);
    }

    @Override
    public void visit(StakeTx tx) {
        totalFee += 50_000;
    }

    @Override
    public void visit(Block block) {
        //
    }

    public long getTotalFee() {
        return totalFee;
    }
}
