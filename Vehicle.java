//Create a Vehicle program where an inner class displays vehicle details and anonymous class performs an action. 
public class Vehicle {
    private String brand;
    private String model;
    private int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public class VehicleDetails {
        public void display() {
            System.out.println("--- Vehicle Details ---");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year : " + year);
            System.out.println("-----------------------");
        }
    }
    public interface VehicleAction {
        void performAction();
    }
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Tesla", "Model S", 2024);
        Vehicle.VehicleDetails details = myCar.new VehicleDetails();
        details.display();
        VehicleAction accAction = new VehicleAction() {
            @Override
            public void performAction() {
                System.out.println("Action: The vehicle is accelerating from 0 to 60 mph");
            }
        };
        accAction.performAction();
    }
}


    