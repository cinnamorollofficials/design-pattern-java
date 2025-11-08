import java.util.ArrayList;
import java.util.List;

public class Block implements TxElement {
    public final int height;
    public final List<TxElement> txs = new ArrayList<>();

    public Block(int height) {
        this.height = height;
    }

    public Block add(TxElement tx) {
        txs.add(tx);
        return this;
    }

    @Override
    public void accept(TxVisitor visitor) {
        visitor.visit(this);
        // traverse children
        for (TxElement tx : txs) {
            tx.accept(visitor);
        }
    }
}
