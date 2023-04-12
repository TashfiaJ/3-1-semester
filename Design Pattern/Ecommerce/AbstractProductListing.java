
public abstract class AbstractProductListing {
    protected Product product;

    public AbstractProductListing(Product product) {
        this.product = product;
    }

    public void displayListing() {
        displayImage();
        displayDescription();
        displayPrice();
        displayInventory();
        displayBuyButton();
    }

    protected abstract void displayImage();
    protected abstract void displayDescription();
    protected abstract void displayPrice();
    protected abstract void displayInventory();
    protected abstract void displayBuyButton();
}
