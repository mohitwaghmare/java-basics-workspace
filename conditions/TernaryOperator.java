package conditions;

// Java Ternary Operator Example
// This program demonstrates ternary operator in Java.

public class TernaryOperator {

    public static void main(String[] args) {

        /*
         * Ternary operator is a shortcut
         * for simple if-else statements.
         */

        int age = 20;

        System.out.println("Age: " + age);

        /*
         * Syntax:
         * condition ? value_if_true : value_if_false
         */

        String result = (age >= 18)
                ? "Eligible to vote"
                : "Not eligible to vote";

        System.out.println(result);

        System.out.println("Ternary operator example completed.");
    }
}