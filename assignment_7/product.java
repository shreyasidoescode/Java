import java.util.Scanner;
interface ProductInfo {
    void displayDetails();
}
class Product {
    int productId;
    String productName;
    double price;
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}
class Electronic extends Product implements ProductInfo {

    Electronic(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    public void displayDetails() {
        System.out.println("\nElectronic Product");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}
class Clothing extends Product implements ProductInfo {
    Clothing(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    public void displayDetails() {
        System.out.println("\nClothing Product");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}
class Grocery extends Product implements ProductInfo {
    Grocery(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    public void displayDetails() {
        System.out.println("\nGrocery Product");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Electronic Product Details");
        System.out.print("Product ID: ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        String ename = sc.nextLine();
        System.out.print("Price: ");
        double eprice = sc.nextDouble();
        sc.nextLine();
        System.out.println("\nEnter Clothing Product Details");
        System.out.print("Product ID: ");
        int cid = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        String cname = sc.nextLine();
        System.out.print("Price: ");
        double cprice = sc.nextDouble();
        sc.nextLine();
        System.out.println("\nEnter Grocery Product Details");
        System.out.print("Product ID: ");
        int gid = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        String gname = sc.nextLine();
        System.out.print("Price: ");
        double gprice = sc.nextDouble();
        Electronic e = new Electronic(eid, ename, eprice);
        Clothing c = new Clothing(cid, cname, cprice);
        Grocery g = new Grocery(gid, gname, gprice);
        System.out.println("\n----- Product Details -----");
        e.displayDetails();
        c.displayDetails();
        g.displayDetails();
        sc.close();
    }
}