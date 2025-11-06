public class HdWalletIterator implements Iterator<String> {
    private final String seed;
    private final int count;
    private int index = 0;

    public HdWalletIterator(String seed, int count) {
        this.seed = seed;
        this.count = count;
    }

    @Override
    public boolean hasNext() {
        return index < count;
    }

    @Override
    public String next() {
        if (!hasNext()) throw new RuntimeException("No more addresses");
        // Fake derivation: seed + index --> dummy address
        return "addr_" + seed.hashCode() + "_" + (index++);
    }
}
