import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11};
        int target = 9;

        int result = findIndex(arr, target, 0);
        System.out.println("Index: " + result);
    }

    static int findIndex(int[] arr, int target, int index) {
        // base case: reached end of array, not found
        if (index == arr.length) {
            return -1;
        }

        // check current element
        if (arr[index] == target) {
            return index;
        }

        // recursive call to check next index
        return findIndex(arr, target, index + 1);
    }

}
