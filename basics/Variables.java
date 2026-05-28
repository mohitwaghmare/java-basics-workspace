// Java Variables Example
// This program demonstrates how different types of variables work in Java.

public class Variables {

    // The main() method is the starting point of every Java program.
    public static void main(String[] args) {

        /*
         * Variables are containers used to store data.
         * Each variable has:
         * 1. A data type
         * 2. A variable name
         * 3. A value
         */

        // int stores whole numbers without decimal values.
        // Example: age, marks, quantity
        int age = 21;

        // double stores decimal numbers.
        // Used when precision values are needed.
        // Example: salary, price, percentage
        double salary = 50000.50;

        // char stores a single character inside single quotes.
        // Only one character is allowed.
        char grade = 'A';

        // boolean stores only true or false values.
        // Mostly used in conditions and decision making.
        boolean isJavaFun = true;

        // String stores text or multiple characters.
        // Strings are written inside double quotes.
        String name = "Mohit";

        /*
         * System.out.println() is used to print output to the console.
         * The + operator is used here for string concatenation
         * (joining text with variable values).
         */

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Java is fun: " + isJavaFun);

        // Final message
        System.out.println("Variables example completed successfully.");
    }
}