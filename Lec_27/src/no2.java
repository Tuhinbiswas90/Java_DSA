//public class no2 {
//    public static void main(String[] args) {
//        fun(5);
//    }
//
//
//    static void fun(int n){
//
//        int i=1;
//        while (i<=n){
//            System.out.println(i);
//            i++;
//        }
//    }
//}

public class no2 {
    public static void main(String[] args) {
        funrev(5);
    }


    static  void funrev(int n){
        if(n == 0){
            return;
        }

        funrev(n-1);
        System.out.println(n);
    }
}

