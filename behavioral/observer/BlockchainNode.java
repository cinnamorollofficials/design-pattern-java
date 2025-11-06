import java.util.ArrayList;
import java.util.List;

public class BlockchainNode implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }

    // simulate new events
    public void newBlock(int height) {
        notifyObservers("New Block: #" + height);
    }

    public void newTransaction(String tx) {
        notifyObservers("New TX: " + tx);
    }
}
