import java.util.Scanner;
interface Printable {
    void printDetails();
}
class Student implements Printable {
    int rollNo;
    String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void printDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}
class Employee implements Printable {
    int empId;
    String empName;
    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public void printDetails() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + empName);
    }
}
public class PrintableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();
        Student student = new Student(rollNo, studentName);
        Employee employee = new Employee(empId, employeeName);
        student.printDetails();
        employee.printDetails();
        sc.close();
    }
}