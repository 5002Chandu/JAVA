package Com.training.encapsulation;

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Rahul");
        acc.deposit(5000);
        acc.withdraw(2000);

        System.out.println("Account Holder : " + acc.getAccountHolder());
        System.out.println("Remaining Balance : " + acc.getBalance());
    }
}
