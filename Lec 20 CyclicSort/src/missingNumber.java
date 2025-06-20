class missingNumber {
    //https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] arr) {

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
            if(arr[index] != index) {
                return index;
            }
        }

        //case 2
        return arr.length;
    }

    static void swap(int[] arr, int i, int correct){

        int temp=arr[i];
        arr[i]= arr[correct];
        arr[correct]=temp;

    }
}