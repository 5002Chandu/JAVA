 package polymorphism;


 class Payment {
    String payerName;

    Payment(String payerName) {
        this.payerName = payerName;
    }

    void processPayment(double amount) {
        System.out.println(payerName + " is making a payment of ₹" + amount);
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String payerName, String upiId) {
        super(payerName);
        this.upiId = upiId;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("[UPI] " + payerName + " paid ₹" + amount + " via " + upiId);
    }
}

class CardPayment extends Payment {
    String cardNumber;

    CardPayment(String payerName, String cardNumber) {
        super(payerName);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("[CARD] " + payerName + " paid ₹" + amount
                + " using card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        // Runtime polymorphism - parent reference, child object
        Payment p1 = new UPIPayment("Ravi", "ravi@upi");
        Payment p2 = new CardPayment("Meena", "1234567890123456");

        p1.processPayment(500.0);
        p2.processPayment(1200.0);

        // instanceof check
        System.out.println("p1 is UPIPayment? " + (p1 instanceof UPIPayment));
        System.out.println("p2 is UPIPayment? " + (p2 instanceof UPIPayment));
    }
}
 