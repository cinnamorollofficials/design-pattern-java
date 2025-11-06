import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class ProxyNode implements Node {
    private final Node realNode;
    private String apiKey;
    private AtomicInteger requestCount = new AtomicInteger(0);
    private Instant resetTime = Instant.now().plusSeconds(60);
    private final int maxRequestsPerMinute = 3;

    public ProxyNode(Node realNode, String apiKey) {
        this.realNode = realNode;
        this.apiKey = apiKey;
    }

    private void checkAuth() {
        if (apiKey == null || apiKey.isBlank()) {
            throw new RuntimeException("Unauthorized API Key!");
        }
    }

    private void checkRateLimit() {
        if (Instant.now().isAfter(resetTime)) {
            resetTime = Instant.now().plusSeconds(60);
            requestCount.set(0);
        }
        if (requestCount.incrementAndGet() > maxRequestsPerMinute) {
            throw new RuntimeException("Rate limit exceeded!");
        }
    }

    @Override
    public void connect() {
        checkAuth();
        realNode.connect(); // lazy connect allowed here
    }

    @Override
    public String sendTx(String raw) {
        checkAuth();
        checkRateLimit();
        return realNode.sendTx(raw);
    }
}
