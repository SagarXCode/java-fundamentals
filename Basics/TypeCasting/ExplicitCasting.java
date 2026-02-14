package TypeCasting;

public class ExplicitCasting {
    public static void main(String[] args) {
        // Basic Example
        double doubleValue = 99.99;
        int intValue = (int) doubleValue; // double → int

        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted to Integer: " + intValue);


        // Data Loss Example
        int bigNumber = 130;
        byte smallNumber = (byte) bigNumber;

        System.out.println("\nOriginal int value: " + bigNumber);
        System.out.println("After casting to byte: " + smallNumber);


        // Floating Point to Integer
        float price = 45.78f;
        int rounded = (int) price;

        System.out.println("\nFloat value: " + price);
        System.out.println("After casting to int: " + rounded);


        // Advanced: Character from Integer
        int asciiValue = 66;
        char character = (char) asciiValue;

        System.out.println("\nASCII value: " + asciiValue);
        System.out.println("Converted Character: " + character);
    }
}
