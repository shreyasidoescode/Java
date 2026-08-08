import java.util.Scanner;
public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String empIdStr = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        String basicSalaryStr = sc.nextLine();
        System.out.print("Enter Bonus Amount: ");
        String bonusStr = sc.nextLine();
        Integer empId = Integer.valueOf(empIdStr);
        Double basicSalary = Double.valueOf(basicSalaryStr);
        Double bonus = Double.valueOf(bonusStr);
        if (basicSalary < 0 || bonus < 0) {
            System.out.println("Invalid salary or bonus amount!");
        } else {
            Double netSalary = basicSalary + bonus;
            System.out.println("\nEmployee Details");
            System.out.println("Employee ID : " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Net Salary  : " + netSalary);
            double primitiveSalary = netSalary.doubleValue();
            System.out.println("Primitive Net Salary: " + primitiveSalary);
        }
        sc.close();
    }
}