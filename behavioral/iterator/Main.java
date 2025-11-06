public class Main {
    public static void main(String[] args) {
        HdWallet wallet = new HdWallet("my_secret_seed", 5);
        Iterator<String> it = wallet.createIterator();

        System.out.println("Derived wallet addresses:");
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }
    }
}
