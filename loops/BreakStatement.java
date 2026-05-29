package loops;

// Java Break Statement Example
// This program demonstrates break statement in Java.

public class BreakStatement {

    public static void main(String[] args) {

        /*
         * break statement is used
         * to immediately stop a loop.
         */

        for (int i = 1; i <= 10; i++) {

            /*
             * Stop loop when i becomes 5.
             */

            if (i == 5) {

                System.out.println("Loop stopped at: " + i);

                break;
            }

            System.out.println("Count: " + i);
        }

        System.out.println("Break statement example completed.");
    }
}