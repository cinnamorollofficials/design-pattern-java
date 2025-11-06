public class SendTokenCommand implements Command {
    private final BlockchainService service;
    private final String from;
    private final String to;
    private final String token;
    private final long amount;

    public SendTokenCommand(BlockchainService service, String from, String to, String token, long amount) {
        this.service = service;
        this.from = from;
        this.to = to;
        this.token = token;
        this.amount = amount;
    }

    @Override
    public void execute() {
        service.sendToken(from, to, token, amount);
    }

    @Override
    public void undo() {
        service.refund(to, from, amount);
    }
}
