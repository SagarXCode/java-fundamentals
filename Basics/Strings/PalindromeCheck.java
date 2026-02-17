package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("The string 'madam' is: ");

        if (str.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
