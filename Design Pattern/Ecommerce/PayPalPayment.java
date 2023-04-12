public class PayPalPayment implements Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {

        System.out.println("Processing PayPal payment of $" + amount + "...");
        return true; // Payment successful
    }
}
