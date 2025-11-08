import java.util.Scanner;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter three integers: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.println("Sum of two integers: " + calc.add(x, y));
        System.out.println("Sum of three integers: " + calc.add(p, q, r));
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));
    }
}