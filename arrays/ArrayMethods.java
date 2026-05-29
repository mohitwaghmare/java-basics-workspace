package arrays;

import java.util.Arrays;

// Java Array Methods Example
// This program demonstrates useful array methods in Java.

public class ArrayMethods {

    public static void main(String[] args) {

        /*
         * Creating integer array.
         */

        int[] numbers = {50, 10, 40, 20, 30};

        /*
         * Arrays.toString()
         * converts array into readable format.
         */

        System.out.println("Original Array:");

        System.out.println(Arrays.toString(numbers));

        /*
         * Arrays.sort()
         * sorts array in ascending order.
         */

        Arrays.sort(numbers);

        System.out.println("\nSorted Array:");

        System.out.println(Arrays.toString(numbers));

        /*
         * length gives total elements.
         */

        System.out.println("\nArray Length: " + numbers.length);

        System.out.println("Array methods example completed.");
    }
}
