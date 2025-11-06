public class TxHistoryComponent extends Component {
    public TxHistoryComponent(Mediator mediator) {
        super(mediator);
    }

    public void addTx(String tx) {
        System.out.println("[TxHistory] New TX: " + tx);
        mediator.notify(this, "tx_added");
    }
}
