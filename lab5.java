class Vehicle {
    String make, model;
    int year, maximumSpeed;

    Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive() {
        System.out.println(make + " " + model + " Vehicle is driving.");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle {
    Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class lab5 {
    public static void main(String[] args) {
        Car c = new Car("Honda", "City", 2020, 180);
        Bike b = new Bike("Yamaha", "R15", 2022, 150);

        System.out.println(c.make + " " + c.model + " " + c.year + " " + c.maximumSpeed);
        System.out.println(b.make + " " + b.model + " " + b.year + " " + b.maximumSpeed);

        c.drive();
        b.drive();
    }
}
