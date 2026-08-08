import java.util.Scanner;
interface Area {
    void calculateArea();
}
class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }
}
class Circle extends Shape implements Area {
    double radius;
    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
class Rectangle extends Shape implements Area {
    double length, width;
    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}
public class ShapeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        Circle c = new Circle(r);
        Rectangle rect = new Rectangle(l, w);
        c.calculateArea();
        rect.calculateArea();
        sc.close();
    }
}