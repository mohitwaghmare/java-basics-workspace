package arrays;

// Java Array Traversal Example
// This program demonstrates traversing an array using loop.

public class ArrayTraversal {

    public static void main(String[] args) {

        /*
         * Array traversal means
         * accessing every element
         * of an array one by one.
         */

        int[] numbers = {10, 20, 30, 40, 50};

        /*
         * numbers.length gives
         * total number of elements.
         */

        System.out.println("Array Elements:");

        // Traversing array using for loop
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        System.out.println("Array traversal example completed.");
    }
}