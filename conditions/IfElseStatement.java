package conditions;

// Java If-Else Statement Example
// This program demonstrates if-else statement in Java.

public class IfElseStatement {

    public static void main(String[] args) {

        /*
         * if-else is used when there are
         * two possible outcomes.
         */

        int age = 16;

        System.out.println("Age: " + age);

        /*
         * If condition is true,
         * if block executes.
         *
         * Otherwise,
         * else block executes.
         */

        if (age >= 18) {

            System.out.println("You are eligible to vote.");

        } else {

            System.out.println("You are NOT eligible to vote.");
        }

        System.out.println("If-else example completed.");
    }
}