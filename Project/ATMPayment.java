package Project;

public class ATMPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.print("Enter amount to withdraw using ATM: ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            System.out.println("Withdrawal of " + amount + " processed via ATM.");
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
