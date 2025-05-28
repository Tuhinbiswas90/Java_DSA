import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=input.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }

        System.out.println("Enter the target value to search: ");
        int target=input.nextInt();
        int ans=binarySearchAlgo(arr,target);
        System.out.println(ans);

    }


    static int binarySearchAlgo(int [] arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= (start+end)/2; //or you can write mid=start+(end-start)/2

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]){
                start=mid +1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
