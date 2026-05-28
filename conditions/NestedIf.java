package conditions;

// Java Nested If Example
// This program demonstrates nested if statements in Java.

public class NestedIf {

    public static void main(String[] args) {

        /*
         * Nested if means an if statement
         * inside another if statement.
         */

        int age = 22;
        boolean hasLicense = true;

        System.out.println("Age: " + age);
        System.out.println("Has License: " + hasLicense);

        /*
         * First condition checks age.
         * Second condition checks license.
         */

        if (age >= 18) {

            System.out.println("Age requirement passed.");

            // Inner if statement
            if (hasLicense == true) {

                System.out.println("You are allowed to drive.");

            } else {

                System.out.println("You need a driving license.");
            }

        } else {

            System.out.println("You are underage.");
        }

        System.out.println("Nested if example completed.");
    }
}