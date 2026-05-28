// Java Comparison Operators Example
// This program demonstrates comparison operators in Java.

public class ComparisonOperators {

    public static void main(String[] args) {

        /*
         * Comparison operators compare two values.
         * They always return true or false.
         */

        int number1 = 20;
        int number2 = 10;

        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);

        System.out.println("\n--- Comparison Results ---");

        // Equal to
        System.out.println("number1 == number2 : " + (number1 == number2));

        // Not equal to
        System.out.println("number1 != number2 : " + (number1 != number2));

        // Greater than
        System.out.println("number1 > number2 : " + (number1 > number2));

        // Less than
        System.out.println("number1 < number2 : " + (number1 < number2));

        // Greater than or equal to
        System.out.println("number1 >= number2 : " + (number1 >= number2));

        // Less than or equal to
        System.out.println("number1 <= number2 : " + (number1 <= number2));

        System.out.println("Comparison operators example completed.");
    }
}