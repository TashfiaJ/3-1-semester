import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String description;
    private double price;
    private String image;
    private int inventory;
    private List<User> customers;
    private Payment payment;

    public Product(String name, String description, double price, String image, int inventory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.inventory = inventory;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public int getInventory() {
        return inventory;
    }

    public void setPayment(Payment payment) {

        this.payment = payment;
        payment.pay(price);

    }

    public boolean purchase(User user) {
        if (inventory > 0) {
            boolean success = payment.pay(price);
            if (success) {
                customers.add(user);
                inventory--;
                user.addProduct(this);
                return true;
            }
        }
        return false;
    }

    public void addCustomer(User user) {
        customers.add(user);
    }
}
