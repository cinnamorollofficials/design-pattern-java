// concrete mediator

public class WalletMediator implements Mediator {
    private BalanceComponent balance;
    private PriceFeedComponent priceFeed;
    private TxHistoryComponent txHistory;
    private NotificationComponent notifier;

    public void setComponents(
            BalanceComponent balance,
            PriceFeedComponent priceFeed,
            TxHistoryComponent txHistory,
            NotificationComponent notifier
    ) {
        this.balance = balance;
        this.priceFeed = priceFeed;
        this.txHistory = txHistory;
        this.notifier = notifier;
    }

    @Override
    public void notify(Component sender, String event) {
        switch (event) {
            case "balance_updated" -> notifier.send("Balance changed: " + balance.getBalance());
            case "price_updated" -> notifier.send("Price changed — refreshing UI");
            case "tx_added" -> notifier.send("A new transaction was recorded");
        }
    }
}
