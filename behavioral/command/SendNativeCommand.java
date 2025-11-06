public class SendNativeCommand implements Command {
    private final BlockchainService service;
    private final String from;
    private final String to;
    private final long amount;

    public SendNativeCommand(BlockchainService service, String from, String to, long amount) {
        this.service = service;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void execute() {
        service.sendNative(from, to, amount);
    }

    @Override
    public void undo() {
        service.refund(to, from, amount);
    }
}
