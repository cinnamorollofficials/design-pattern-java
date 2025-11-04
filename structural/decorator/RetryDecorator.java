public class RetryDecorator extends NodeDecorator {
    private final int maxAttempts;

    public RetryDecorator(Node node, int maxAttempts){
        super(node);
        this.maxAttempts = maxAttempts;
    }

    @Override
    public String sendRawTx(String rawTx){
        int attempt = 0;
        while (true) { 
            try {
                attempt++;
                System.out.println("[RETRY]: attempt :"+attempt);
                return  super.sendRawTx(rawTx);
            } catch (Exception e) {
                if (attempt >= maxAttempts) {
                    throw new RuntimeException("Failed after " + maxAttempts + " attempts", e);
                }
                System.out.println("[RETRY] Retrying...");
            }
        }
    }
}