// Java Logical Operators Example
// This program demonstrates logical operators in Java.

public class LogicalOperators {

    public static void main(String[] args) {

        /*
         * Logical operators are used to combine
         * multiple conditions.
         *
         * They return true or false.
         */

        int age = 21;
        boolean hasLicense = true;

        System.out.println("Age: " + age);
        System.out.println("Has License: " + hasLicense);

        System.out.println("\n--- Logical Operator Results ---");

        /*
         * Logical AND (&&)
         * Returns true only if BOTH conditions are true.
         */

        boolean andResult = (age >= 18) && (hasLicense == true);

        System.out.println("AND Result: " + andResult);

        /*
         * Logical OR (||)
         * Returns true if at least ONE condition is true.
         */

        boolean orResult = (age < 18) || (hasLicense == true);

        System.out.println("OR Result: " + orResult);

        /*
         * Logical NOT (!)
         * Reverses the boolean value.
         */

        boolean notResult = !(hasLicense);

        System.out.println("NOT Result: " + notResult);

        System.out.println("Logical operators example completed.");
    }
}