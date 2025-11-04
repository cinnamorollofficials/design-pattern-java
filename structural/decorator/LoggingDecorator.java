public class LoggingDecorator extends NodeDecorator {
    public LoggingDecorator(Node node){
        super(node);
    }

    @Override
    public void connect(){
        System.out.println("[LOG] connecting...");
        super.connect();
        System.out.println("[LOG] connected.");
    }

    @Override
    public String sendRawTx(String rawTx){
        System.out.println("[LOG] sending tx: "+rawTx);
        String result = super.sendRawTx(rawTx);
        System.err.println("[LOG] tx hash: "+ result);

        return  result;
    }
}