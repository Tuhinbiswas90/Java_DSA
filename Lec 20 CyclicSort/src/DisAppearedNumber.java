import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }

        // just find missing no's

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index< nums.length;index++){
            if(nums[index] != index+1){
                ans.add(index + 1);
            }
        }

        return ans;
    }



    void swap(int[] nums, int i, int correct){

        int temp=nums[i];
        nums[i]= nums[correct];
        nums[correct]=temp;

    }
}