package Strings;

public class StringDeclaration {
    public static void main(String[] args) {
        // 1. Using String literal (Static Memory)
        String s1 = "Hello World!";
        System.out.println("s1: " + s1);

        // 2. Using new keyword (Heap Memory)
        String s2 = new String("Hello World!");
        System.out.println("s2: " + s2);

        // Comparing references
        System.out.println("Comparing references, s1 == s2: " + (s1 == s2));

        // Comparing values
        System.out.println("Comparing values, s1 equals s2: " + s1.equals(s2));
    }
}
