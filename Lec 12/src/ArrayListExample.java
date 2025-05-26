import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
//        list.add(64);
//        list.add(4);
//        list.add(24);
//        list.add(94);
//        list.add(74);
//        list.add(644);
//
//        System.out.println(list);
//        list.set(0,100);
//
//        list.remove(1);
//        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
