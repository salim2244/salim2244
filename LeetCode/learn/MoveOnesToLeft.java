package LeetCode.learn;
import java.util.Arrays;
public class MoveOnesToLeft {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 1, 7, 1, 9, 2}; // Sample array

        moveOnesToLeft(arr);

        // Print the modified array
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }

    public static void moveOnesToLeft(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];  // Temporary array to store the result
        int index = 0;

        // First, place all 1s on the left side
        for (int num : arr) {
            if (num == 1) {
                temp[index++] = 1;
            }
        }

        // Then, place all other elements while maintaining their order
        for (int num : arr) {
            if (num != 1) {
                temp[index++] = num;
            }
        }

        // Copy back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}