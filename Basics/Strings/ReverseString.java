package Strings;

public class ReverseString {
    public static void main(String[] args) {
        // Method 1: Using for loop
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Using for loop:");
        System.out.println("Reversed: " + reversed);


        // Method 2: Using StringBuilder
        String original = "Hello World!";
        StringBuilder reversedString = new StringBuilder(original);

        // Use the built-in reverse method
        reversedString.reverse();
        System.out.println("Using StringBuilder:");
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversedString.toString());
    }
}
