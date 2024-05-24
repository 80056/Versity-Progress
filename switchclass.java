import java.util.Scanner;
public class switchclass {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);
        digit = input.nextInt();
        switch(digit){
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 32:
                System.out.println("thirty two");
                break;
            default:
                break;

        }

    }
}
