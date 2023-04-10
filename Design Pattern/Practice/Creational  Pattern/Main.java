public class Main {
    public static void main(String[] args) {
        ChickenPizzaBuilder chickenPizzaBuilder = new ChickenPizzaBuilder();
        CheesePizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();

        PizzaChef pizzaChef = new PizzaChef();
        pizzaChef.makeChickenPizza(chickenPizzaBuilder);
        pizzaChef.makeCheesePizza(cheesePizzaBuilder);

        ChickenPizza chickenPizza = chickenPizzaBuilder.getChickenPizza();

        System.out.println("Chicken Pizza is ready!!");
        System.out.println("\nPizza dough is - "+chickenPizza.getPizzaDough());
        System.out.println("Pizza meat is - "+chickenPizza.getPizzaMeat());
        System.out.println("Pizza Sauce is - "+chickenPizza.getPizzaSauce());
        System.out.println("Pizza toppings is - "+chickenPizza.getPizzaToppings());

        System.out.println("\nEnjoy your pizza!!!!");

    }
}
