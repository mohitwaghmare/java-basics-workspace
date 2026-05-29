package loops;

// Java Do-While Loop Example
// This program demonstrates do-while loop in Java.

public class DoWhileLoop {

    public static void main(String[] args) {

        /*
         * do-while loop executes
         * the code block first,
         * then checks the condition.
         */

        int count = 1;

        /*
         * Syntax:
         *
         * do {
         *     code
         * } while(condition);
         */

        do {

            System.out.println("Count: " + count);

            // Increment value
            count++;

        } while (count <= 5);

        System.out.println("Do-while loop example completed.");
    }
}