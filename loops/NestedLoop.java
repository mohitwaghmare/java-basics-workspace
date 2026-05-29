package loops;

// Java Nested Loop Example
// This program demonstrates nested loops in Java.

public class NestedLoop {

    public static void main(String[] args) {

        /*
         * Nested loop means
         * a loop inside another loop.
         */

        /*
         * Outer loop controls rows.
         */

        for (int i = 1; i <= 3; i++) {

            System.out.println("Row: " + i);

            /*
             * Inner loop controls columns.
             */

            for (int j = 1; j <= 5; j++) {

                System.out.println("Column: " + j);
            }

            System.out.println();
        }

        System.out.println("Nested loop example completed.");
    }
}