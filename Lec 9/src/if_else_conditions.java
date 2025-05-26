public class if_else_conditions {
    public static void main(String[] args) {
        int salary = 35000;
        if(salary > 20000){
            salary = salary + 2000;
        }else if(salary > 10000 && salary < 20000){
            salary = salary - 2000;
        }
        else {
            salary +=10000;
        }
        System.out.println(salary);
    }
}
