package Arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {40, 20, 50, 30, 10};

        // Sorting
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Binary Search
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30 after sorting: " + index);

        // Copy array
        int[] copy = Arrays.copyOf(arr, 3);
        System.out.println("Copied Array: " + Arrays.toString(copy));
    }
}
