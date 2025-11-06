public class Main {
    public static void main(String[] args) {
        Handler chain = new SignatureValidator();
        chain.setNext(new BalanceValidator())
             .setNext(new GasValidator())
             .setNext(new AntiFraudValidator());

        TxRequest req = new TxRequest(
                "0xAlice",
                "0xBob",
                100,
                true,       // signature ok
                500,        // balance ok
                30000       // gas ok
        );

        System.out.println("🚀 Processing TX");
        chain.handle(req);
        System.out.println("🎉 Transaction approved!");
    }
}
