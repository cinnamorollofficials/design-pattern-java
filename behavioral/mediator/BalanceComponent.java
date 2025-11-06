public class BalanceComponent extends Component {
    private double balance = 0;

    public BalanceComponent(Mediator mediator) {
        super(mediator);
    }

    public void updateBalance(double amount) {
        balance += amount;
        System.out.println("[Balance] New balance: " + balance);
        mediator.notify(this, "balance_updated");
    }

    public double getBalance() {
        return balance;
    }
}
