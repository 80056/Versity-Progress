import java.util.Scanner;

public class UserdefindException extends Exception {
    UserdefindException (String msg){
        super(msg);
    }
    UserdefindException(int val){
        super("Your value is only "+val+" Please enter a greater value");
    }

}

class test {
    public static void main(String[] args) {
            try
            {
                System.out.println("inner try");
                Scanner sc = new Scanner(System.in);
                int v = sc.nextInt();
                if(v<100){
                    throw new UserdefindException("get msg");
                    //throw new UserdefindException(v);
                }
            } catch (UserdefindException e){
                System.out.println(e.getMessage());
            }
    }
}