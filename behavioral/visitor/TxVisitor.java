public interface TxVisitor {
    void visit(TransferTx tx);
    void visit(ContractCallTx tx);
    void visit(StakeTx tx);
    void visit(Block block);
}