package conditions;

// Java Else-If Ladder Example
// This program demonstrates else-if ladder in Java.

public class ElseIfLadder {

    public static void main(String[] args) {

        /*
         * Else-if ladder is used when
         * multiple conditions need to be checked.
         */

        int marks = 75;

        System.out.println("Marks: " + marks);

        /*
         * Conditions are checked from top to bottom.
         * First true condition gets executed.
         */

        if (marks >= 90) {

            System.out.println("Grade A");

        } else if (marks >= 75) {

            System.out.println("Grade B");

        } else if (marks >= 50) {

            System.out.println("Grade C");

        } else {

            System.out.println("Fail");
        }

        System.out.println("Else-if ladder example completed.");
    }
}