public class GasValidator extends Handler {
    @Override
    public void handle(TxRequest request) {
        if (request.gas < 21000) { // EVM minimal tx gas
            throw new RuntimeException("❌ Not enough gas");
        }
        System.out.println("✅ Gas OK");
        if (next != null) next.handle(request);
    }
}
