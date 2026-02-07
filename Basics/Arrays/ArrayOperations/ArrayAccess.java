package Arrays.ArrayOperations;

public class ArrayAccess {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango" };
        // Accessing
        System.out.println("First fruit: " + fruits[0]);

        // Modifying
        fruits[1] = "Guava";
        System.out.println("Updated second fruit: " + fruits[1]);
    }
}
