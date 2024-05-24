import java.util.*;
public class TestException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean successful = false;
        while(!successful) {
            System.out.println("Enter 2 numbers: ");
            try {
                int a, b, c;
                a = scan.nextInt();
                b = Integer.parseInt(scan.nextLine().trim());
                c = a/b;
                System.out.println(" value is :"+c);
                successful = true;
            }
            catch (ArithmeticException ob2)
            {
                System.out.println("divided by zero");
                System.out.println(" Error this the code: " + ob2.getMessage());
            }
            catch (InputMismatchException ob3){
                System.out.println("Need 2 numbers for division");
                if (scan.hasNextLine()){
                    scan.nextLine();
                }
            }
            catch (NumberFormatException ob1)
            {
                System.out.println("Need 2 numbers for division");
            }
        }
        scan.close();
    }
}