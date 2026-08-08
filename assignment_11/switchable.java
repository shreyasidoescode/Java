import java.util.Scanner;
interface Switchable {
    void turnOn();
}
class Light implements Switchable {
    String lightName;
    Light(String lightName) {
        this.lightName = lightName;
    }
    public void turnOn() {
        System.out.println("\nLight Name : " + lightName);
        System.out.println("Status     : Light is ON");
    }
}
class Fan implements Switchable {
    String fanName;
    Fan(String fanName) {
        this.fanName = fanName;
    }
    public void turnOn() {
        System.out.println("\nFan Name   : " + fanName);
        System.out.println("Status     : Fan is ON");
    }
}
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Light Name: ");
        String lightName = sc.nextLine();
        System.out.print("Enter Fan Name: ");
        String fanName = sc.nextLine();
        Light light = new Light(lightName);
        Fan fan = new Fan(fanName);
        light.turnOn();
        fan.turnOn();
        sc.close();
    }
}