public class Main {
    public static void main(String[] args) {
        BlockchainNode node = new BlockchainNode();

        Observer ui = new WalletUIObserver();
        Observer notify = new NotificationObserver();
        Observer logger = new TxLoggerObserver();

        node.subscribe(ui);
        node.subscribe(notify);
        node.subscribe(logger);

        node.newBlock(20001);
        node.newTransaction("0xabc123");

        System.out.println("\nUnsubscribing UI...\n");
        node.unsubscribe(ui);

        node.newBlock(20002);
    }
}
