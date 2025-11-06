public class PriceFeedComponent extends Component {
    public PriceFeedComponent(Mediator mediator) {
        super(mediator);
    }

    public void priceUpdate() {
        System.out.println("[Prices] Prices updated");
        mediator.notify(this, "price_updated");
    }
}
