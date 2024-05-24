import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        int count = 0;
        // String input with the Java Scanner
        System.out.println("Enter Num");
        Scanner stringScanner = new Scanner(System.in);
        int n = stringScanner.nextInt();
        for (int i = 2; i<n ; i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("Prime");
        }
        else System.out.println("Not Prime");
    }
}