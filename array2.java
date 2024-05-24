import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner kutta = new Scanner(System.in);
        System.out.println("Enter size");
        int size = kutta.nextInt();
        int[] jjj = new int[size];
        for(int i = 0; i<jjj.length;i++){
            jjj[i] = kutta.nextInt();
        }
        for(int j = 0; j<jjj.length;j++){
            System.out.println(jjj[j]);

        }
    }
}
