package Project;

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose payment method: ");
        System.out.println("1. Credit Card  2. Debit Card  3. Net Banking  4. UPI  5. ATM");
        int choice = sc.nextInt();

        Payment payment;
        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                break;
           
            case 2:
                payment = new UPIPayment();
                break;
            case 3:
                payment = new ATMPayment();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        payment.makePayment();
    }
}
