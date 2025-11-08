import java.util.Scanner;

class Veh {
    String make;
    String model;
    int year;
    int price;

    Veh(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }
}

public class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cars do you want to create? ");
        int n = sc.nextInt();
        sc.nextLine();

        Veh[] cars = new Veh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car " + (i + 1) + ":");

            System.out.print("Make: ");
            String make = sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            System.out.print("Year: ");
            int year = sc.nextInt();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine();

            cars[i] = new Veh(make, model, year, price);
        }

        System.out.println("\n--- Car Details ---");
        for (int i = 0; i < n; i++) {
            cars[i].display();
        }
    }
}