public class CheapGasStrategy implements GasStrategy {
    @Override
    public long calculateGas(long baseGas) {
        System.out.println("Cheap Gas Strategy (0.5x)");
        return Math.round(baseGas * 0.5);
    }
}
