package Strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "Java";

        // Using + operator
        System.out.println(firstString + " " + "World!");
        // Using concat() method
        System.out.println(firstString.concat(" " + secondString));
    }
}
