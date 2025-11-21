abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
}

public class shapes12 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
