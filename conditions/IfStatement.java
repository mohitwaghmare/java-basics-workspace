// Java If Statement Example
// This program demonstrates the use of if statement in Java.
package conditions;
public class IfStatement {

    public static void main(String[] args) {

        /*
         * The if statement is used
         * to execute code only when
         * a condition is true.
         */

        int age = 21;

        System.out.println("Age: " + age);

        /*
         * Condition:
         * If age is greater than or equal to 18,
         * then the block inside if will execute.
         */

        if (age >= 18) {

            System.out.println("You are eligible to vote.");
        }

        System.out.println("If statement example completed.");
    }
}