public class StakeTx implements TxElement {
    public final String delegator;
    public final String validator;
    public final long amount;

    public StakeTx(String delegator, String validator, long amount) {
        this.delegator = delegator;
        this.validator = validator;
        this.amount = amount;
    }

    @Override
    public void accept(TxVisitor visitor) {
        visitor.visit(this);
    }
}
