package loops;

// Java While Loop Example
// This program demonstrates while loop in Java.

public class WhileLoop {

    public static void main(String[] args) {

        /*
         * while loop executes
         * as long as condition is true.
         */

        int count = 1;

        /*
         * Syntax:
         *
         * while(condition)
         */

        while (count <= 5) {

            System.out.println("Count: " + count);

            // Increment count value
            count++;
        }

        System.out.println("While loop example completed.");
    }
}