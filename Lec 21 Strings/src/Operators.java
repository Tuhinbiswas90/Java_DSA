import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        // 'a' --> character
        //Char + Char = int (97+98)

        System.out.println("a" + "b");
        // "a" --> String
        //String + String = "ab"

        System.out.println("a" + 1);
        //String + int = "a1" (int converted to String)
        //"a" is a String and 1 is an int
        //When a String and a number are joined with +, Java converts the number to a string and concatenates:



        System.out.println('a' + "a");
        //Char + String = "aa" (char converted to String)
        //'a' is a char (97), "a" is a String
        //When a char and a String are joined with +, Java converts the char to String ("a") and concatenates:


        System.out.println("Tuhin" + new ArrayList<>());

        System.out.println("Tuhin" + new Integer(99));

        String ans = new Integer(99) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
