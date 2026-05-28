// Java Type Casting Example
// This program demonstrates implicit and explicit type casting.

public class TypeCasting {

    public static void main(String[] args) {

        /*
         * Type casting means converting one data type
         * into another data type.
         */

        // Implicit Casting (Automatic)
        
        /*
         * Java automatically converts smaller data types
         * into larger data types.
         */

        int number = 100;

        // int converted to double automatically
        double convertedNumber = number;

        System.out.println("Original int value: " + number);
        System.out.println("Converted double value: " + convertedNumber);

        // Explicit Casting (Manual)

        /*
         * Large data types must be converted manually
         * into smaller data types.
         */

        double price = 99.99;

        // double converted to int manually
        int convertedPrice = (int) price;

        System.out.println("Original double value: " + price);
        System.out.println("Converted int value: " + convertedPrice);

        /*
         * Notice:
         * Decimal part is removed after converting
         * double into int.
         */

        System.out.println("Type casting example completed.");
    }
}