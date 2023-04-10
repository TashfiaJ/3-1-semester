public class ChickenPizza implements Pizza{
    @Override
    public void pizzaType() {
        System.out.println("This is a chicken pizza.");
    }

    @Override
    public void addElements() {
        System.out.println("Adding chicken..");
    }
}
