public interface TxElement {
    void accept(TxVisitor visitor);
}