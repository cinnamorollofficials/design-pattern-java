public class Main {
    public static void main(String[] args) {
        WalletMediator mediator = new WalletMediator();

        BalanceComponent balance = new BalanceComponent(mediator);
        PriceFeedComponent priceFeed = new PriceFeedComponent(mediator);
        TxHistoryComponent txHistory = new TxHistoryComponent(mediator);
        NotificationComponent notify = new NotificationComponent(mediator);

        mediator.setComponents(balance, priceFeed, txHistory, notify);

        balance.updateBalance(100);
        txHistory.addTx("0x123");
        priceFeed.priceUpdate();
    }
}
