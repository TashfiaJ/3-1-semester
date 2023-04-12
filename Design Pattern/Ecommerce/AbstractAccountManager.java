public abstract class AbstractAccountManager {
    protected User user;

    public AbstractAccountManager(User user) {
        this.user = user;
    }

    public void displayAccountInfo() {
        displayName();
        displayEmail();
        displayAddress();
        displayPurchaseHistory();
        displayEditButton();
    }

    protected abstract void displayName();
    protected abstract void displayEmail();
    protected abstract void displayAddress();
    protected abstract void displayPurchaseHistory();
    protected abstract void displayEditButton();
}
