public class Main {
    public static void main(String[] args) {
        WalletBalance w1 = new WalletBalance(
                "0xAlice",
                TokenFactory.getToken("ETH"),
                1.2
        );

        WalletBalance w2 = new WalletBalance(
                "0xBob",
                TokenFactory.getToken("ETH"),
                0.8
        );

        WalletBalance w3 = new WalletBalance(
                "SoL_Alice",
                TokenFactory.getToken("SOL"),
                30
        );

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        System.out.println("\nETH metadata object reused? " +
                (TokenFactory.getToken("ETH") == TokenFactory.getToken("ETH")));
    }
}
