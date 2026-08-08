import java.io.*;
import java.util.Scanner;
public class PatientFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis = sc.nextLine();
        FileWriter fw = new FileWriter("patient.txt");
        fw.write("Patient ID: " + id + "\n");
        fw.write("Patient Name: " + name + "\n");
        fw.write("Age: " + age + "\n");
        fw.write("Diagnosis: " + diagnosis + "\n");
        fw.close();
        System.out.println("\nPatient details written to file.");
        FileReader fr = new FileReader("patient.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("\nPatient Details from File:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
        sc.close();
    }
}
//asasa
