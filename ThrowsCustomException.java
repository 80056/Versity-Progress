import java.util.*;
public class ThrowsCustomException {
    public static void main(String[] args) {
        System.out.println("age? :");

        Scanner scan = new Scanner(System.in);
        int store_age = scan.nextInt();
        try {
            check(store_age);
        } catch (MyException e){
            System.out.println("sorry");
        }
    }
    static void check(int age) throws MyException{
        if (age<18){
            throw new MyException("you must be 18");
        }
    }
}
