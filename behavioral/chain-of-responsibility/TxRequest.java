// data request

public class TxRequest {
    public final String from;
    public final String to;
    public final long amount;
    public final boolean validSignature;
    public final long balance;
    public final long gas;

    public TxRequest(String from, String to, long amount, boolean validSignature, long balance, long gas){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.validSignature = validSignature;
        this.balance = balance;
        this.gas = gas;
    }


}