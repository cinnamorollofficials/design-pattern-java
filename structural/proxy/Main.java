public class Main {
    public static void main(String[] args) {
        Node node = new ProxyNode(new RealEvmNode(), "API_KEY_123");

        node.connect();
        System.out.println(node.sendTx("0xDEAD1"));
        System.out.println(node.sendTx("0xDEAD2"));
        System.out.println(node.sendTx("0xDEAD3"));

        // Uncomment to see rate limit
        // System.out.println(node.sendTx("0xDEAD4"));
    }
}
