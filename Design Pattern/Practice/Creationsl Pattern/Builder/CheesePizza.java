public class CheesePizza {
    private String pizzaDough, pizzaMeat, pizzaSauce, pizzaToppings;
    public CheesePizza(String pizzaDough, String pizzaMeat, String pizzaSauce, String pizzaToppings){
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
