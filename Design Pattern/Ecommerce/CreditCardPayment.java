public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardPayment(String cardNumber, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean pay(double amount) {

        System.out.println("Processing credit card payment of $" + amount + "...");
        return true;
    }
}
