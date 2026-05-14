package Project;

public class CreditCardPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.print("Enter amount to pay by Credit Card: ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            System.out.println("Payment of " + amount + " processed via Credit Card.");
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
