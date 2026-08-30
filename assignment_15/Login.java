package asgn15;
import java.util.Scanner;
class Login {
    static void checkPassword(String password) throws Exception {
        if (!password.equals("admin123")) {
            throw new Exception("Invalid Password");
        }
        System.out.println("Login Successful");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        try {
            checkPassword(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Login attempt completed.");
        }
    }
}