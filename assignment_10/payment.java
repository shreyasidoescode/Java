import java.util.Scanner;
abstract class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    abstract void makePayment();
}
class CreditCard extends Payment {
    CreditCard(double amount) {
        super(amount);
    }
    void makePayment() {
        System.out.println("\nPayment Method: Credit Card");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}
class UPI extends Payment {
    UPI(double amount) {
        super(amount);
    }
    void makePayment() {
        System.out.println("\nPayment Method: UPI");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Payment Method");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();
        Payment payment;
        if (choice == 1) {
            payment = new CreditCard(amount);
        } else if (choice == 2) {
            payment = new UPI(amount);
        } else {
            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }
        payment.makePayment();
        sc.close();
    }
}
