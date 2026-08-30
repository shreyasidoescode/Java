package asgn15;
import java.util.Scanner;
class ATM {
    static void verifyPIN(int pin) throws Exception {
        if (pin != 1234) {
            throw new Exception("Invalid PIN");
        }
        System.out.println("PIN Verified Successfully");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();
        try {
            verifyPIN(pin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("PIN verification attempt completed.");
        }
    }
}
