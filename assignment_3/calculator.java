public class Calculator {
    static int calculationCount = 0;
    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }
    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int intResult = calc.add(10, 20);
        System.out.println("Integer Addition: " + intResult);
        double doubleResult = calc.add(12.5, 7.8);
        System.out.println("Decimal Addition: " + doubleResult);
        System.out.println("Another Integer Addition: " + calc.add(50, 25));
        System.out.println("Total Calculations Performed: " + calculationCount);
    }
}