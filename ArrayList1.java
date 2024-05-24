import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Before adding numbers : "+ number.size() + " ");
        number.add(67);
        number.add(99);
        number.add(0);
        number.add(47);
        number.add(65);
        number.add(5,65);
//        for (int num: number){
//            System.out.println(num);
//        }

//        number.remove(0);
//        Boolean b = number.isEmpty();
//        System.out.println(b);
//        number.clear();
//        Boolean b1 = number.isEmpty();
//        System.out.println(b1);

        boolean pos = number.contains(67);
        System.out.println(pos);

//        System.out.println(number);
//        System.out.println("After adding numbers : "+ number.size() + " ");
    }

}
