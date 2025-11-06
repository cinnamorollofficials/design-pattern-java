public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: +" + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw: -" + amount + " | Balance: " + balance);
    }

    public WalletMemento save() {
        return new WalletMemento(balance);
    }

    public void restore(WalletMemento memento) {
        this.balance = memento.getBalance();
        System.out.println("Restored balance to: " + balance);
    }
}
