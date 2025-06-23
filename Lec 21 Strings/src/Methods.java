import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name= "Tuhin Biswas";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.split( " ")));
    }
}
