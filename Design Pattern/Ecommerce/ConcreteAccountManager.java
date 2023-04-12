public class ConcreteAccountManager extends AbstractAccountManager {
    public ConcreteAccountManager(User user) {
        super(user);
    }

    @Override
    protected void displayName() {
        System.out.println(user.getName());
    }

    @Override
    protected void displayEmail() {
        System.out.println(user.getEmail());
    }

    @Override
    protected void displayAddress() {
        System.out.println(user.getAddress());
    }

    @Override
    protected void displayPurchaseHistory() {
        System.out.println("Purchase history: " + user.getProducts());
    }

    @Override
    protected void displayEditButton() {
        System.out.println("Edit Account");
    }
}
