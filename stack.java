import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack <String> ();

      //  System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("SkyRim");
        stack.push("BoarderLand");

        System.out.println(stack.empty());

        System.out.println(stack);

        String peek = stack.peek();
        System.out.println(peek);

       // String myFavgame = stack.pop();

       // System.out.println(myFavgame);
        int m = stack.search("Doom");

        System.out.println(m);

        for (int i = 0; i < 1000000000; i++) {
            stack.push("fallout76");
        }
    }
}
