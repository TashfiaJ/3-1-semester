import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Product> products = new ArrayList<>();

    public ConcreteMediator() {
        // Initialize product list
        products.add(new Product("Laptop", 70000.0));
        products.add(new Product("Phone", 40000.0));
        products.add(new Product("Computer", 6000.0));
    }

    @Override
    public void purchase(Product product, UserTemplate user) {
        PaymentStrategy paymentStrategy = user.getPaymentStrategy();
        double discountPercentage = user.getDiscountPercentage();
        double discountedAmount = product.getPrice() * (100 - discountPercentage) / 100;
        paymentStrategy.processPayment(discountedAmount);
    }

    @Override
    public void displayProducts(UserTemplate user) {
        System.out.println("Available Items:");
        for (Product product : products) {
            System.out.println(product.getProductName() + " ---> " + product.getPrice());
        }
    }
}