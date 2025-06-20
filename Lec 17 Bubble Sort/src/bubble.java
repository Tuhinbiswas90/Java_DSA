import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,0,-10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
         //run the steps n-1 times
        for (int i=0;i< arr.length;i++){
            //for each step, max item will come at the last respective index
            for (int j=1;j<arr.length - i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]< arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
