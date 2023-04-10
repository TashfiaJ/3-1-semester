public class ChickenPizza {
    private String pizzaDough, pizzaMeat, pizzaSauce, pizzaToppings;

    public ChickenPizza(String pizzaDough, String pizzaMeat, String pizzaSauce, String pizzaToppings){
        this.pizzaDough=pizzaDough;
        this.pizzaMeat=pizzaMeat;
        this.pizzaSauce=pizzaSauce;
        this.pizzaToppings=pizzaToppings;
    }

    public String getPizzaDough() {
        return pizzaDough;
    }

    public String getPizzaMeat() {
        return pizzaMeat;
    }

    public String getPizzaSauce() {
        return pizzaSauce;
    }

    public String getPizzaToppings() {
        return pizzaToppings;
    }
}
