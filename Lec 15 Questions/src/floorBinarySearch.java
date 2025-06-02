public class floorBinarySearch {
    public static void main(String[] args) {
        int[]arr={ 1,2,3,4,6,7,8,9};
        int target= 6;
        int ans= Floor(arr,target);
        System.out.println(arr[ans]);
    }

    static int Floor(int[] arr, int target){
        int start=0;
        int end= arr.length -1;

        while (start<=end){
            int mid= (start+end)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid + 1;
            }

        }
        return  end;
    }
}
