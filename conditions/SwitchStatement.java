package conditions;

// Java Switch Statement Example
// This program demonstrates switch statement in Java.

public class SwitchStatement {

    public static void main(String[] args) {

        /*
         * Switch statement is used
         * to select one option
         * from multiple choices.
         */

        int day = 3;

        System.out.println("Day Number: " + day);

        /*
         * Switch checks the value
         * and executes matching case.
         */

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        System.out.println("Switch statement example completed.");
    }
}