// Java Unary Operators Example
// This program demonstrates unary operators in Java.

public class UnaryOperators {

    public static void main(String[] args) {

        /*
         * Unary operators work on only one operand.
         */

        int number = 10;

        System.out.println("Initial value: " + number);

        // Increment operator
        number++;

        System.out.println("After increment (++): " + number);

        // Decrement operator
        number--;

        System.out.println("After decrement (--): " + number);

        /*
         * Unary minus changes positive to negative.
         */

        int negativeNumber = -number;

        System.out.println("Negative value: " + negativeNumber);

        /*
         * Logical NOT operator reverses boolean value.
         */

        boolean isJavaEasy = true;

        System.out.println("Original boolean value: " + isJavaEasy);

        System.out.println("After NOT operator: " + !isJavaEasy);

        System.out.println("Unary operators example completed.");
    }
}