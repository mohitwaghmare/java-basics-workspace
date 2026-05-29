package arrays;

import java.util.Scanner;

// Java Array User Input Example
// This program demonstrates taking array input from user.

public class ArrayUserInput {

    public static void main(String[] args) {

        /*
         * Scanner is used to take input
         * from the user.
         */

        Scanner scanner = new Scanner(System.in);

        /*
         * Creating array of size 5.
         */

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        /*
         * Taking input using loop.
         */

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");

            numbers[i] = scanner.nextInt();
        }

        /*
         * Displaying array elements.
         */

        System.out.println("\nArray Elements:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        scanner.close();

        System.out.println("Array user input example completed.");
    }
}