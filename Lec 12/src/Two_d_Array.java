import java.util.Arrays;
import java.util.Scanner;

public class Two_d_Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int[][] arr=new int[3][3];
        System.out.println(arr.length);//no. of rows

        //input
        for (int row=0;row< arr.length;row++){
            for (int col=0; col<arr[row].length;col++){
                  arr[row][col]=in.nextInt();
            }
        }

        //output
//        for (int row=0;row< arr.length;row++){
//            for (int col=0; col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //output
        for (int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();
        //output
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
