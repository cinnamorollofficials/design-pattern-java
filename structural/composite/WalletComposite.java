import java.util.ArrayList;
import java.util.List;

public class WalletComposite implements PortfolioComponent {
    private final String walletName;
    private final List<PortfolioComponent> items = new ArrayList<>();

    public WalletComposite(String walletName) {
        this.walletName = walletName;
    }

    public void add(PortfolioComponent comp) {
        items.add(comp);
    }

    @Override
    public long getValueInUsd() {
        return items.stream()
                .mapToLong(PortfolioComponent::getValueInUsd)
                .sum();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + walletName + " (Total $" + getValueInUsd() + ")");
        for (PortfolioComponent c : items) {
            c.print(indent + "  ");
        }
    }
}
