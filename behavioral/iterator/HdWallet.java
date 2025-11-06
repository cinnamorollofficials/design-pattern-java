public class HdWallet implements WalletCollection {
    private final String seed;
    private final int count; // how many addresses to simulate

    public HdWallet(String seed, int count) {
        this.seed = seed;
        this.count = count;
    }

    @Override
    public Iterator<String> createIterator() {
        return new HdWalletIterator(seed, count);
    }
}
