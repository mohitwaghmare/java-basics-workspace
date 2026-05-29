package arrays;

// Java Two Dimensional Array Example
// This program demonstrates 2D arrays in Java.

public class TwoDimensionalArray {

    public static void main(String[] args) {

        /*
         * A two-dimensional array
         * stores data in rows and columns.
         */

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        /*
         * Outer loop controls rows.
         * Inner loop controls columns.
         */

        System.out.println("2D Array Elements:\n");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");
            }

            // Move to next line after each row
            System.out.println();
        }

        System.out.println("\nTwo dimensional array example completed.");
    }
}