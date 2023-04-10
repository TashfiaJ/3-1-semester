public class ChickenPizzaBuilder implements PizzaBuilder{

    private String pizzaDough, pizzaMeat, pizzaSauce, pizzaToppings;
    @Override
    public void setPizzaDough(String pizzaDough) {
        this.pizzaDough=pizzaDough;
    }

    public String getPizzaDough() {
        return pizzaDough;
    }

    @Override
    public void setPizzaMeat(String pizzaMeat) {
        this.pizzaMeat=pizzaMeat;
    }

    public String getPizzaMeat() {
        return pizzaMeat;
    }

    @Override
    public void setPizzaSauce(String pizzaSauce) {
        this.pizzaSauce=pizzaSauce;
    }

    public String getPizzaSauce() {
        return pizzaSauce;
    }

    @Override
    public void setPizzaToppings(String pizzaToppings) {
        this.pizzaToppings=pizzaToppings;
    }

    public String getPizzaToppings() {
        return pizzaToppings;
    }

    public ChickenPizza getChickenPizza(){
        return new ChickenPizza(pizzaDough,pizzaMeat,pizzaSauce,pizzaToppings);
    }
}
