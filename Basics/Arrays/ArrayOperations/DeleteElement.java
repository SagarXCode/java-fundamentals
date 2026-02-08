package Arrays.ArrayOperations;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length - 1];
        int deleteIndex = 3;

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != deleteIndex) {
                newArr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Before deletion: " + Arrays.toString(arr));
        System.out.println("Removing element at index 3...");
        System.out.println("After deletion: " + Arrays.toString(newArr));
    }
}
