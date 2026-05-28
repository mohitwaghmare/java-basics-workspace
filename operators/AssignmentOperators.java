// Java Assignment Operators Example
// This program demonstrates assignment operators in Java.

public class AssignmentOperators {

    public static void main(String[] args) {

        /*
         * Assignment operators are used
         * to assign and update values in variables.
         */

        int number = 10;

        System.out.println("Initial Value: " + number);

        // Add and assign
        number += 5;
        System.out.println("After += 5: " + number);

        // Subtract and assign
        number -= 3;
        System.out.println("After -= 3: " + number);

        // Multiply and assign
        number *= 2;
        System.out.println("After *= 2: " + number);

        // Divide and assign
        number /= 4;
        System.out.println("After /= 4: " + number);

        // Modulus and assign
        number %= 3;
        System.out.println("After %= 3: " + number);

        System.out.println("Assignment operators example completed.");
    }
}