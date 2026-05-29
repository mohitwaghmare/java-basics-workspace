package loops;

// Java Continue Statement Example
// This program demonstrates continue statement in Java.

public class ContinueStatement {

    public static void main(String[] args) {

        /*
         * continue statement skips
         * the current iteration
         * and moves to next iteration.
         */

        for (int i = 1; i <= 5; i++) {

            /*
             * Skip iteration when i becomes 3.
             */

            if (i == 3) {

                System.out.println("Skipped number: " + i);

                continue;
            }

            System.out.println("Count: " + i);
        }

        System.out.println("Continue statement example completed.");
    }
}