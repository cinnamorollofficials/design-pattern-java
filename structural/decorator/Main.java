public class Main {
    public static void main(String[] args) {
        Node node = new EvmNode();

        // Decorate: Logging + Retry
        node = new LoggingDecorator(node);
        node = new RetryDecorator(node, 3);

        node.connect();

        String hash = node.sendRawTx("0xDEADBEEF");
        System.out.println("Final tx hash: " + hash);
    }
}
