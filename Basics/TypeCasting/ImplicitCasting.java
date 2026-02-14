package TypeCasting;

public class ImplicitCasting {
    public static void main(String[] args) {
        // Basic Example
        int intValue = 100;
        double doubleValue = intValue; // int → double (automatic)

        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        // Multiple Widening
        byte b = 10;
        int i = b;        // byte → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double

        System.out.println("\nWidening Chain Conversion:");
        System.out.println("byte: " + b);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // char to int (ASCII conversion)
        char ch = 'A';
        int ascii = ch;

        System.out.println("\nCharacter: " + ch);
        System.out.println("ASCII value: " + ascii);
    }
}
