import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr,i,correct)
            }else{
                i++
            }
        }

        // just find missing no's

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index< arr.length;index++){
            if(arr[index] != index+1){
                ans.add(index);
            }
        }

        return ans;
    }

    static void swap(int[] arr,int i, int correct){
        int temp=arr[i];
        arr[i]= arr[correct];
        arr[correct]=temp;
    }
}