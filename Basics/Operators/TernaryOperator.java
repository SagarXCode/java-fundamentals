package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int score = 95;
        // Ternary Operator
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 60) ? "C" : "Fail";

        System.out.println(grade);
    }
}
