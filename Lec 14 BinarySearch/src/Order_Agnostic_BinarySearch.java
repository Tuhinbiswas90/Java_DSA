public class Order_Agnostic_BinarySearch  {
    public static void main(String[] args) {
        int[] arr1={1,2,3,5,6,8,9};
        int[] arr2={90,50,49,40,30,20,15,10,5};
        int target1=5;
        int target2=5;
        
        int ans1=OrderAgnosticBS(arr1,target1);
        System.out.println(ans1);

        int ans2=OrderAgnosticBS(arr2,target2);
        System.out.println(ans2);

    }


    static int OrderAgnosticBS(int [] arr,int target){
        int start=0;
        int end= arr.length-1;

        //find whether the array is sorted in ascending or descending order
        boolean isAsc= arr[start]<arr[end];

        while (start<=end){
            int mid= (start+end)/2; //or you can write mid=start+(end-start)/2

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else if(target>arr[mid]){
                    start=mid +1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                } else if(target<arr[mid]){
                    start=mid +1;
                }
            }
        }
        return -1;
    }
}
