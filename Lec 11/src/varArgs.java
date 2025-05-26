import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,5,74,85,4,5,5,54,5,5);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
