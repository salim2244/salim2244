package LeetCode.learn;
import java.util.*;

public class MoveOnesToRight {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 1, 7, 1, 9, 2}; // Sample array

        moveOnesToRight(arr);

        // Print the modified array
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }

    public static void moveOnesToRight(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];  // Temporary array to store the result
        int index = 0;

        // First, place all non-1 elements while maintaining their order
        for (int num : arr) {
            if (num != 1) {
                temp[index++] = num;
            }
        }

        // Then, place all 1s at the right side
        while (index < n) {
            temp[index++] = 1;
        }

        // Copy back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
