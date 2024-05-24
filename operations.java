import java.util.Scanner;
public class operations {
    public static void main(String[] args) {
   System.out.println("Enter the price of your phone");
   Scanner inputprice = new Scanner(System.in);
   float takeprice;
   takeprice = inputprice.nextFloat();
   System.out.println("Enter installation month ");
   float EMI;
   EMI = inputprice.nextFloat();
   float sum = takeprice/EMI;
   System.out.printf("You will give %f per month",sum);



    }
}
