public class AntiFraudValidator extends Handler {
    @Override
    public void handle(TxRequest request) {
        if (request.amount > 1_000_000_000_000L) {
            throw new RuntimeException("❌ Suspicious transaction flagged");
        }
        System.out.println("✅ Anti-fraud passed");
        if (next != null) next.handle(request);
    }
}
