package methods;

// Java Method Parameters Example
// This program demonstrates methods with parameters.

public class MethodParameters {

    /*
     * Parameters allow data
     * to be passed into methods.
     */

    static void greetUser(String name) {

        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {

        /*
         * Passing different values
         * to the same method.
         */

        greetUser("Mohit");

        greetUser("Java Learner");

        greetUser("Developer");

        System.out.println("Method parameters example completed.");
    }
}