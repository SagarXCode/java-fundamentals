package Strings;

public class StringImmutability {
    public static void main(String[] args) {
        String s = "Hello";
        // This creates "Hello World" in memory, but drops it immediately

        s.concat(" World");
        // s still points to the original "Hello"
        System.out.println(s);

        // This creates "Hello World" AND reassigns s to point to it
        s = s.concat(" World");
        // s now points to the new, combined String
        System.out.println(s);
    }
}
