public class ChickenPizzaMaker extends PizzaMaker{
    @Override
    public Pizza pizzaMake() {
        return new ChickenPizza();
    }
}
