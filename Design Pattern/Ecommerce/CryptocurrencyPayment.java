public class CryptocurrencyPayment implements Payment {
    private String walletAddress;
    private String privateKey;

    // constructor and other methods

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Crypto payment of $" + amount + "...");
        return true;
    }
}
