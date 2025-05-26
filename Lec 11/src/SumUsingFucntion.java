import java.util.Scanner;

public class SumUsingFucntion {
    public static void main(String[] args) {
//      int ans = sum2();
//        System.out.println(ans);

      int ans3= sum3(20,30);
        System.out.println(ans3);

    }

    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1 : ");
        int num1=in.nextInt();
        System.out.print("Enter no. 2 : ");
        int num2=in.nextInt();

        int sum1=num1+num2;
        return sum1;

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1 : ");
        int num1=in.nextInt();
        System.out.print("Enter no. 2 : ");
        int num2=in.nextInt();

        int sum=num1+num2;
        System.out.println("The Sum is : "+ sum);

    }
}
