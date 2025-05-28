import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }


        System.out.print("Enter the target value to search: ");
        int target = input.nextInt();

        int ans = linearSearchAlgo(nums, target);
        System.out.println(ans);
    }

    // search in arr: return the index if item found
    // otherwise if item not found return -1
    static int linearSearchAlgo(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run for a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will execute if none of the statements above have executed
        //hence the target not found
        return -1;
    }
}
