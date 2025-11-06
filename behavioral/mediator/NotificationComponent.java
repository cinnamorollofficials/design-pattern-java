public class NotificationComponent extends Component {
    public NotificationComponent(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg) {
        System.out.println("[Notification] " + msg);
    }
}
