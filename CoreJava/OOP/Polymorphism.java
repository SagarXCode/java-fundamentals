package OOP;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        System.out.println("Sum of 2 and 3: " + math.add(2, 3)); // Calls add(int, int)
        System.out.println("Sum of 1, 2 and 3: " + math.add(1, 2, 3)); // Calls add(int, int, int)
    }
}
