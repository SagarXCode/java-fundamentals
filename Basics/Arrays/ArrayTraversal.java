package Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Using for-loop
        System.out.println("Using for-loop:");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
