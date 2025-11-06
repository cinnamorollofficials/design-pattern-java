public class BalanceValidator extends Handler {
    @Override
    public void handle(TxRequest request) {
        if (request.balance < request.amount) {
            throw new RuntimeException("❌ Insufficient balance");
        }
        System.out.println("✅ Balance sufficient");
        if (next != null) next.handle(request);
    }
}
