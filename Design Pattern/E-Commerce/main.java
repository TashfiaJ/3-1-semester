public class Main {
    public static void main(String[] args) {
        // Create ecommerce shop mediator
        Mediator mediator = new ConcreteMediator();

        // Create users with different payment strategies and discount percentages
        UserTemplate user1 = new CreditCardUser("John", 10);
        UserTemplate user2 = new PayPalUser("Jane", 5);
        UserTemplate user3 = new CryptocurrencyUser("Bob", 15);

        // Display available products for each user
        user1.displayAvailableProducts(mediator);
        //user2.displayAvailableProducts(mediator);
        // user3.displayAvailableProducts(mediator);

        user1.showUserDetails(user1);

        // User1 purchases toy car
        Product laptop = new Product("Laptop", 70000.0);
        System.out.print("For " + user1.getName() + ": ");
        user1.purchaseProduct(laptop, mediator);

        user2.showUserDetails(user2);
        // User 2 purchases toy gun
        Product phone = new Product("Phone", 40000.0);
        System.out.print("For " + user2.getName() + ": ");
        user2.purchaseProduct(phone, mediator);

        // User 3 purchases toy car and toy gun
//        user3.purchaseProduct(laptop, mediator);
//        user3.purchaseProduct(phone, mediator);
    }
}
