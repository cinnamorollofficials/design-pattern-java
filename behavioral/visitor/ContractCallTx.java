public class ContractCallTx implements TxElement {
    public final String from;
    public final String contract;
    public final String method;
    public final String[] args;

    public ContractCallTx(String from, String contract, String method, String... args) {
        this.from = from;
        this.contract = contract;
        this.method = method;
        this.args = args;
    }

    @Override
    public void accept(TxVisitor visitor) {
        visitor.visit(this);
    }
}
