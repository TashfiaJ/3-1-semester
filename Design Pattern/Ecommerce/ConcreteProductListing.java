public class ConcreteProductListing extends AbstractProductListing {
    public ConcreteProductListing(Product product) {
        super(product);
    }

    @Override
    protected void displayImage() {
        System.out.println(product.getImage());
    }

    @Override
    protected void displayDescription() {
        System.out.println(product.getDescription());
    }

    @Override
    protected void displayPrice() {
        System.out.println(product.getPrice());
    }

    @Override
    protected void displayInventory() {
        System.out.println("Inventory: " + product.getInventory());
    }

    @Override
    protected void displayBuyButton() {
        System.out.println("Buy Now");
    }
}
