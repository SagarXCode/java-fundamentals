package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.delete(4, 13);
        sb.reverse();

        System.out.println(sb);
    }
}