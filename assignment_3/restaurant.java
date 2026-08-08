public class RestaurantBilling {
    static int totalOrders = 0;
    double calculateBill(double amount) {
        totalOrders++;
        return amount + (amount * 0.05);
    }
    double calculateBill(double amount, boolean takeaway) {
        totalOrders++;
        return amount + (amount * 0.10);
    }
    double calculateBill(double amount, double deliveryCharge) {
        totalOrders++;
        return amount + deliveryCharge;
    }
    public static void main(String[] args) {
        RestaurantBilling rb = new RestaurantBilling();
        double dineIn = rb.calculateBill(500);
        System.out.println("Dine-in Bill: Rs. " + dineIn);
        double takeaway = rb.calculateBill(400, true);
        System.out.println("Takeaway Bill: Rs. " + takeaway);
        double delivery = rb.calculateBill(600, 50);
        System.out.println("Delivery Bill: Rs. " + delivery);
        System.out.println("Total Orders Processed: " + totalOrders);
    }
}