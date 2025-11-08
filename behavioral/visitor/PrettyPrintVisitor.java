// Concrete Visitor #1

import java.util.Arrays;

public class PrettyPrintVisitor implements TxVisitor {
    @Override
    public void visit(TransferTx tx) {
        System.out.println("Transfer: " + tx.from + " → " + tx.to + " | amount=" + tx.amount);
    }

    @Override
    public void visit(ContractCallTx tx) {
        System.out.println("ContractCall: from=" + tx.from +
                " contract=" + tx.contract + " method=" + tx.method +
                " args=" + Arrays.toString(tx.args));
    }

    @Override
    public void visit(StakeTx tx) {
        System.out.println("Stake: " + tx.delegator + " → validator=" + tx.validator +
                " | amount=" + tx.amount);
    }

    @Override
    public void visit(Block block) {
        System.out.println("\nBlock #" + block.height + " | txCount=" + block.txs.size());
    }
}
