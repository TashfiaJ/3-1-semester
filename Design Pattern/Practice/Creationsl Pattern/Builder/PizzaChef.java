public class PizzaChef {

    public void makeChickenPizza(PizzaBuilder pizzaBuilder){
       pizzaBuilder.setPizzaDough("Thin Crust.");
       pizzaBuilder.setPizzaMeat("Chicken");
       pizzaBuilder.setPizzaSauce("Tomato");
       pizzaBuilder.setPizzaToppings("Olive");
    }

    public void makeCheesePizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setPizzaDough("Thick Crust.");
        pizzaBuilder.setPizzaMeat("Beef");
        pizzaBuilder.setPizzaSauce("Tomato");
        pizzaBuilder.setPizzaToppings("Cheese");
    }
}
