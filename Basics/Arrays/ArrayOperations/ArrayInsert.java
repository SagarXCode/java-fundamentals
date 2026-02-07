package Arrays.ArrayOperations;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Before: " + java.util.Arrays.toString(arr));
        System.out.println("Element at index 2: " + arr[2]);

        // Inserting new element at index 2
        int newValue = 100;
        int targetIndex = 2;

        // Creating a larger array of size 6
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < targetIndex) {
                newArr[i] = arr[i];     // Copy elements before the gap
            } else if (i == targetIndex) {
                newArr[i] = newValue;    // Drop the 100 into the gap
            } else {
                newArr[i] = arr[i - 1];     // Shifting remaining elements
            }
        }
        System.out.println("After:  " + java.util.Arrays.toString(newArr));
    }
}
