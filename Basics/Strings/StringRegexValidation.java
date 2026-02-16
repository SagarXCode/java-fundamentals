package Strings;

public class StringRegexValidation {
    public static void main(String[] args) {
        String email = "test@gmail.com";

        boolean valid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

        System.out.println("Valid Email: " + valid);
    }
}
