import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total data consumed (in GB): ");
        int data = sc.nextInt();
        int bill;

        if (data < 10) {
            bill = 300;
        } 
        else if (data <= 30) {
            bill = 300 + 5 * (data - 10);
        } 
        else {
            bill = 400 + 3 * (data - 30);
        }

        System.out.println("Your total bill is: Rs. " + bill);
    }
}