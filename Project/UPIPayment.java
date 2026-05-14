package Project;

public class UPIPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.print("Enter amount to pay by UPI: ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            System.out.println("Payment of " + amount + " processed via UPI.");
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
