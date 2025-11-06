public class BlockchainService {
    public void sendNative(String from, String to, long amount) {
        System.out.println("Native TX: " + from + " -> " + to + " amount=" + amount);
    }

    public void sendToken(String from, String to, String token, long amount) {
        System.out.println("Token TX: " + from + " -> " + to + " token=" + token + " amount=" + amount);
    }

    public void refund(String to, String from, long amount) {
        System.out.println("Refund: " + to + " -> " + from + " amount=" + amount);
    }
}
