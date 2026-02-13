package Strings;

public class StringComparison {
    public static void main(String[] args) {
        String fruit1 = "Apple";
        String fruit2 = "apple";

        System.out.println(fruit1.equals(fruit2));
        System.out.println(fruit1.equalsIgnoreCase(fruit2));
        System.out.println(fruit1.compareTo(fruit2));
    }
}
