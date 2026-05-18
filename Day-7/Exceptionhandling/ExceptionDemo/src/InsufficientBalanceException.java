public class InsufficientBalanceException extends Exception {

    double shortfall;

    public InsufficientBalanceException(double shortfall) {
        super("Insufficient balance! Short by ₹" + shortfall);
        this.shortfall = shortfall;
    }
}