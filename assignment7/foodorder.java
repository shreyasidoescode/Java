import java.util.Scanner;
abstract class FoodOrder {
    double amount;
    FoodOrder(double amount) {
        this.amount = amount;
    }
    abstract void calculateBill();
}
class DineInOrder extends FoodOrder {
    DineInOrder(double amount) {
        super(amount);
    }
    void calculateBill() {
        double serviceCharge = amount * 0.10;
        double totalBill = amount + serviceCharge;

        System.out.println("\nOrder Type: Dine-In");
        System.out.println("Food Amount: Rs. " + amount);
        System.out.println("Service Charge: Rs. " + serviceCharge);
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}
class TakeAwayOrder extends FoodOrder {
    TakeAwayOrder(double amount) {
        super(amount);
    }
    void calculateBill() {
        double packingCharge = 30;
        double totalBill = amount + packingCharge;
        System.out.println("\nOrder Type: Take Away");
        System.out.println("Food Amount: Rs. " + amount);
        System.out.println("Packing Charge: Rs. " + packingCharge);
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}
public class FoodOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Order Type");
        System.out.println("1. Dine-In");
        System.out.println("2. Take Away");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter Food Amount: ");
        double amount = sc.nextDouble();
        FoodOrder order;
        if (choice == 1) {
            order = new DineInOrder(amount);
        } else if (choice == 2) {
            order = new TakeAwayOrder(amount);
        } else {
            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }
        order.calculateBill();
        sc.close();
    }
}
