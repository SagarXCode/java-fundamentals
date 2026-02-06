package Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        // Declaration & Initialization
        int[] num = {1, 2, 3, 4, 5};

        // Accessing elements
        System.out.println("First element: " + num[0]);
        System.out.println("Second element: " + num[1]);
        System.out.println("Third element: " + num[2]);
        System.out.println("Fourth element: " + num[3]);
        System.out.println("Fifth element: " + num[4]);

        // Modifying Element
        num[2] = 12;
        System.out.println("Modified Third element: " + num[2]);
    }
}