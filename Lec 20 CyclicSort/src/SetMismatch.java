class Solution {

    //https://leetcode.com/problems/set-mismatch/
    public int[] findErrorNums(int[] arr) {

            int i=0;
            while (i<arr.length) {
                int correct = arr[i];

                if (arr[i]< arr.length && arr[i] != arr[i]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }


            //search for 1st misssing no.

            for (int index=0;index < arr.length;index++){
                if(arr[index] != index + 1) {
                    return new int[] {arr[index],index + 1};
                }
            }

            //case 2
            return new int[]{-1,-1};
        }

        static void swap(int[] arr, int i, int correct){

            int temp=arr[i];
            arr[i]= arr[correct];
            arr[correct]=temp;

        }
    }
