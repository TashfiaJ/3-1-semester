public class CheesePizzaMaker extends PizzaMaker{
    @Override
    public Pizza pizzaMake() {
        return new ChessePizza();
    }

}
