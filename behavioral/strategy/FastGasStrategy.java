public class FastGasStrategy implements GasStrategy {
    @Override
    public long calculateGas(long baseGas) {
        System.out.println("Fast Gas Strategy (2x)");
        return baseGas * 2;
    }
}
