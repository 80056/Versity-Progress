import java.math.MathContext;
public class IfWithRandom {
    public void checkMyswitch() {
        int x = (int) (Math.random() * 100);
        System.out.println(x);
        switch (x) {
            case 7:
                System.out.println(x);
                break;
            case 9:
                System.out.println(x + 1);
                break;
            case 99:
                System.out.println(x - 2);
                break;
            case 88:
                System.out.println(x * 6);
            default:
                System.out.println("None of them were true");
        }
    }
    public static void main(String[] args) {
        IfWithRandom chk = new IfWithRandom();
        chk.checkMyswitch();
    }
}
