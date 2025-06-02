public class ceilingBinarySearch {
    public static void main(String[] args) {
        int[]arr={ 1,2,3,4,6,7,8,9};
        int target=5 ;
        int ans= Ceiling(arr,target);
        if (ans == -1) {
            System.out.println("No ceiling found for " + target);
        } else {
            System.out.println("Ceiling of " + target + " is: " + arr[ans]);
        }
    }

    //return the index of smallest n0 >= target
    static int Ceiling(int[] arr, int target){
        int start=0;
        int end= arr.length -1;

        //but what if the target element is greater than the greatest number in the array
        if(target>arr[arr.length - 1]){
            return  -1;
        }


        while (start<=end){
            int mid= (start+end)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(target<arr[mid]){
                end=mid-1;
            }d
            if(target>arr[mid]){
                start=mid + 1;
            }
        }
        return  start;
    }
}
