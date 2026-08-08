import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double salary;
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : Rs. " + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(int empId, String empName, double salary, String department) {
        super(empId, empName, salary);   
        this.department = department;
    }
    void displayManager() {
        System.out.println("\n----- Manager Details -----");
        super.displayEmployee();
        System.out.println("Department    : " + department);
    }
}
public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        Manager m = new Manager(id, name, salary, dept);
        m.displayManager();
        sc.close();
    }
}