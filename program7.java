package Demo;
import java.util.Scanner;

public class program 7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate age in dog years
        int dogYears = age * 7;

        // Display the result
        System.out.println("Your age in dog years is " + dogYears);

        // Close the scanner
        scanner.close();
    }
}
