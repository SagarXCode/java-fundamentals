package Strings;

public class StringSearching {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("ing"));
    }
}
