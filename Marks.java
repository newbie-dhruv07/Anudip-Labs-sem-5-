import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double average;
        int[] marks = new int[5];

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        if (average > 90) {
            System.out.println("Grade = Ex");
        } else if (average > 80) {
            System.out.println("Grade = A");
        } else if (average > 60) {
            System.out.println("Grade = B");
        } else if (average >= 40) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = F");
        }
    }
}