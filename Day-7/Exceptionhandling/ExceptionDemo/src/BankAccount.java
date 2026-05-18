public class BankAccount {

    double balance = 15000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientBalanceException(shortfall);
        }

        balance = balance - amount;

        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}