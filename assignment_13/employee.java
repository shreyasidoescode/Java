import java.io.*;
import java.util.Scanner;
public class EmployeeFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        FileWriter fw = new FileWriter("employee.txt");
        fw.write("Employee ID: " + id + "\n");
        fw.write("Employee Name: " + name + "\n");
        fw.write("Employee Salary: " + salary + "\n");
        fw.close();
        System.out.println("\nEmployee details written to file.");
        FileReader fr = new FileReader("employee.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("\nEmployee Details from File:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
        sc.close();
    }
}