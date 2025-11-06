import java.util.Stack;

public class WalletHistory {
    private final Stack<WalletMemento> history = new Stack<>();

    public void push(WalletMemento m) {
        history.push(m);
    }

    public WalletMemento pop() {
        return history.pop();
    }
}
