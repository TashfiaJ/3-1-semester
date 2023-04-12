public class Main {

    public static void main(String[] args) {
        // Creating e-commerce platform
        ECommercePlatform platform = new ECommercePlatform();

        // Creating products
        Product product1 = new Product("Product 1", "Description 1", 9.99, "image1.jpg", 10);
        Product product2 = new Product("Product 2", "Description 2", 19.99, "image2.jpg", 5);

        // platform e product add korbo
        platform.addProduct(product1);
        platform.addProduct(product2);

        // Creating users
        User user1 = new User("User 1", "user1@example.com", "password1", "123 Main St");
        User user2 = new User("User 2", "user2@example.com", "password2", "456 Oak St");

        // platform e user add
        platform.addUser(user1);
        platform.addUser(user2);

        // product e payment option add
        product1.setPayment(new CreditCardPayment("1234 5678 9012 3456", "123", "12/24"));
        platform.purchaseProduct(user1, product1);
        product2.setPayment(new PayPalPayment("user2@example.com", "password2"));

        // Purchase products using different payment options

        platform.purchaseProduct(user2, product2);

        System.out.println("User Info:");
        AbstractAccountManager abstractAccountManager=new ConcreteAccountManager(user1);
        abstractAccountManager.displayAccountInfo();

        System.out.println("Product Info:");
        AbstractProductListing abstractProductListing=new ConcreteProductListing(product1);
        abstractProductListing.displayListing();

    }

}
