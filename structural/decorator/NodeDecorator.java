// Base Decorator

public abstract class NodeDecorator implements Node {
    protected final Node next;

    public NodeDecorator(Node next){
        this.next = next;
    }

    @Override
    public void connect(){
        next.connect();
    }

    @Override
    public String sendRawTx(String rawTx){
        return next.sendRawTx(rawTx);
    }
}