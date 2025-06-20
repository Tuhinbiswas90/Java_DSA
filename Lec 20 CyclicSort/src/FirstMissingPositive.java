class Solution {
    //https://leetcode.com/problems/first-missing-positive/
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int correct = arr[i];

            if (arr[i]>0 && arr[i]<= arr.length && arr[i] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }


        //search for 1st misssing no.

        for (int index=0;index < arr.length;index++){
            if(arr[index] != index + 1) {
                return index + 1;
            }
        }

        //case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int i, int correct){

        int temp=arr[i];
        arr[i]= arr[correct];
        arr[correct]=temp;

    }
    
}