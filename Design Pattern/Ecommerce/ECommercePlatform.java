import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    private List<Product> products;
    private List<User> users;

    public ECommercePlatform() {
        products = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void purchaseProduct(User user, Product product) {
        if (product.purchase(user)) {
            System.out.println(user.getName() + " purchased " + product.getName() + " for $" + product.getPrice());
        } else {
            System.out.println("Purchase unsuccessful for " + product.getName());
        }
    }
}
