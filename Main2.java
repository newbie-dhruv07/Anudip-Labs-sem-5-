class Shape {
    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    int length;
    Square(int length) {
        this.length = length;
    }
    double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    int width, height;
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);
        Rectangle r = new Rectangle(3, 6);

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Square Area: " + s.getArea());
        System.out.println("Rectangle Area: " + r.getArea());
    }
}
