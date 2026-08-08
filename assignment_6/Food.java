import java.util.Scanner;
public class FoodDelivery {
    interface DeliveryStatus {
        void showStatus();
    }
    class OrderDetails {
        String customerName;
        String foodItem;
        int quantity;
        OrderDetails(String customerName, String foodItem, int quantity) {
            this.customerName = customerName;
            this.foodItem = foodItem;
            this.quantity = quantity;
        }
        void displayOrder() {
            System.out.println("\n----- Order Details -----");
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + foodItem);
            System.out.println("Quantity      : " + quantity);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Food Item: ");
        String food = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        FoodDelivery app = new FoodDelivery();
        OrderDetails order = app.new OrderDetails(name, food, qty);
        order.displayOrder();
        DeliveryStatus status = new DeliveryStatus() {
            public void showStatus() {
                System.out.println("Delivery Status: Your order is out for delivery.");
            }
        };
        status.showStatus();
        sc.close();
    }
}