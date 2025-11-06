public class SignatureValidator extends Handler {
    @Override 
    public void handle(TxRequest request) {
        if (!request.validSignature) {
            throw new RuntimeException("❌ Invalid signature");
        }
        System.out.println("✅ Signature valid");
        if (next != null) next.handle(request);
    }
}