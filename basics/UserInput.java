// Java User Input Example
// This program demonstrates how to take input from the user.


// Importing Scanner class from Java utility package
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        /*
         * Scanner is used to take input from keyboard.
         * We create a Scanner object to read user data.
         */

        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Taking decimal input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        /*
         * Displaying user input back to console.
         */

        System.out.println("\n----- User Details -----");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Closing scanner object
        scanner.close();

        System.out.println("User input example completed.");
    }
}