import java.util.ArrayList;

public class ArrayListRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7,7, 9, 11};


        ArrayList<Integer> result = findAllIndex(arr, 7, 0, new ArrayList<>());
        System.out.println("Indices: " + result);
    }



    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if( index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
