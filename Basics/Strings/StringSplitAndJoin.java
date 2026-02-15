package Strings;

import java.util.Arrays;

public class StringSplitAndJoin {
    public static void main(String[] args) {
        String str = "Java is a programming language";

        // Split string
        String[] words = str.split(" ");
        System.out.println("Split words: " + Arrays.toString(words));

        // Join string
        String joinedString = String.join("-", words);
        System.out.println("Joined string: " + joinedString);
    }
}
