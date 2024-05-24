import java.util.Scanner;
public class ThisClassIsUnderAPackage {
    public static void main(String[] args) {
        int number;
        Scanner InputFromKeyboard = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        number = InputFromKeyboard.nextInt();
        System.out.printf("you entered %d",number);
    }
}
