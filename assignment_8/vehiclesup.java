import java.util.Scanner;
class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicle() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}
class Insurance extends Vehicle {
    double premium;
    Insurance(String vehicleNumber, String ownerName, String vehicleType, double premium) {
        super(vehicleNumber, ownerName, vehicleType); 
        this.premium = premium;
    }
    void displayInsurance() {
        System.out.println("\n----- Vehicle Insurance Details -----");
        super.displayVehicle();
        System.out.println("Premium Amount : Rs. " + premium);
    }
}
public class VehicleInsuranceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Insurance Premium: ");
        double premium = sc.nextDouble();
        Insurance insurance = new Insurance(number, owner, type, premium);
        insurance.displayInsurance();
        sc.close();
    }
}