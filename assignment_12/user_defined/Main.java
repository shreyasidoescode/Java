import java.util.Scanner;
import student.Student;
import faculty.Faculty;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Faculty ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Faculty Name: ");
        String facultyName = sc.nextLine();

        Student s = new Student(roll, studentName);
        Faculty f = new Faculty(id, facultyName);

        System.out.println();
        s.displayStudent();
        f.displayFaculty();

        sc.close();
    }
}