import java.util.Random;
import java.util.Scanner;

public class Constructor {
    public static String name;
    public String id;
    public double balance;

    public Constructor() {
    id = new Random().nextInt(99999)+"";
    name = "jose";

    }
 public Constructor(String name, double balance){
     this.name = name;
     this.balance = balance;

 }

    public static void main(String[] args) {
        Constructor justId = new Constructor();
        Constructor iid = new Constructor("sara",787878);
        System.out.println("name is = "+ name);
        System.out.println("Balance = "+iid.balance);
        System.out.println(justId.id);
        System.out.println(name);
            Scanner takeName = new Scanner(System.in);
        name = takeName.nextLine();

    }
}
