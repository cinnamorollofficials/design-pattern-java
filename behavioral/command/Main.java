public class Main {
    public static void main(String[] args) {
        BlockchainService service = new BlockchainService();
        Invoker wallet = new Invoker();

        wallet.run(new SendNativeCommand(service, "Alice", "Bob", 1000));
        wallet.run(new SendTokenCommand(service, "Bob", "Carol", "USDT", 500));

        System.out.println("\n Undo last command");
        wallet.undoLast();
    }
}
