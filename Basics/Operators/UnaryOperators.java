package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;

        System.out.println("Post-increment: " + (value1++));
        System.out.println("Pre-increment: " + (++value1));

        System.out.println("Post-decrement: " + (value2--));
        System.out.println("Pre-decrement: " + (--value2));
    }
}
