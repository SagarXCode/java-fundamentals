package Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 1;  // Binary: 0001
        int b = 2;  // Binary: 0010

        // 1. Bitwise AND (&) Operator
        // 0001 & 0010 = 0000 (0)
        System.out.println("a & b: " + (a & b));

        // 2. Bitwise OR (|) Operator
        // 0001 | 0010 = 0011 (3)
        System.out.println("a | b: " + (a | b));

        // 3. Bitwise XOR (^) Operator
        // 0001 ^ 0010 = 0011 (3)
        System.out.println("a^b: " + (a ^ b));

        // 4. Bitwise Complement (~)
        // Inverts bits: -2
        System.out.println("~a: " + (~a));

        // 5. Bitwise Left Shift
        // 0001 becomes 0010 (2)
        System.out.println("a << 1 (Left Shift): " + (a << 1));

        // 6. Bitwise Right Shift
        // 0010 becomes 0001 (1)
        System.out.println("b >> 1 (Right Shift): " + (b >> 1));


        // 7. Bitwise Unsigned Right Shift
        // Unsigned Right Shift by 2 (num >>> 2)
        // Step 1: Start with 0001
        // Step 2: Shift right 1 -> 0000 (the 1 moves to the last slot)
        // Step 3: Shift right 2 -> 0000 (the 1 is pushed out completely)
        // Left side is always filled with 0s.
        System.out.println("Bitwise Unsigned Right Shift: " + (a >>> 2));
    }
}
