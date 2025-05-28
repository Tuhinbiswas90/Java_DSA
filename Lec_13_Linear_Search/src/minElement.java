public class minElement {
    public static void main(String[] args) {
        int[] arr={15,5,2,4,8,7,10};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return  ans;
    }
}
