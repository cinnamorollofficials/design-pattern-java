public class NormalGasStrategy implements GasStrategy {
    @Override
    public long calculateGas(long baseGas) {
        System.out.println("Normal Gas Strategy (1x)");
        return baseGas;
    }
}
