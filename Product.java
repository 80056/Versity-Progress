import java.util.Scanner;
public class Product
{
    public static void main(String[] args) {
        System.out.println("How Many Cutomer?");
        Scanner Numbers = new Scanner(System.in);
        int n = Numbers.nextInt();
        System.out.printf("Enter the information of %d customer\n",n);
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter your id");
            Scanner Number = new Scanner(System.in);
            int ID = Number.nextInt();
            System.out.println("Enter category");
            Scanner Words = new Scanner(System.in);
            String category = Words.nextLine();
            System.out.println("Enter title");
            Scanner NotManyWords = new Scanner(System.in);
            String Title = NotManyWords.nextLine();
            System.out.println("Enter Price");
            Scanner floatnum = new Scanner(System.in);
            float price = floatnum.nextFloat();
            System.out.println("Enter description");
            Scanner SoManyWords = new Scanner(System.in);
            String description  = SoManyWords.nextLine();
            System.out.printf("for customer index %d, ID = %d\n",i,ID);
            System.out.printf("category is = %s\n",category);
            System.out.printf("title is = %s\n",Title);
            System.out.printf("price = %f\n",price);
            System.out.printf("Description is = %s\n",description);

        }
    }
}
