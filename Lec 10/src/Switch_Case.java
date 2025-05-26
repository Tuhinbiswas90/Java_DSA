import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit= in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Please a valid fruit");
                break;
        }

        // for convert into this syntax you need to select switch then alt+enter and then convert into new syntax....
        switch (fruit) {
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please a valid fruit");
        }
    }
}
