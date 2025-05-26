import java.lang.reflect.Array;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        for (int j : arr) {  //for every element in the array , print the element
            System.out.println(j + " "); // here j is represents element of the array
        }
    }
}