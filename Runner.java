import java.util.ArrayList;
import java.util.*;
class Runner {
    public static void main(String[] args) {
        ArrayList<laptop> laps = new ArrayList<>();

        laps.add(new laptop("Dell", 700, 12));
        laps.add(new laptop("acer", 1200, 8));
        laps.add(new laptop("apple", 1500, 64));
        laps.add(new laptop("vivo", 400, 14));
        laps.add(new laptop("hp", 700, 4));

        Collections.sort(laps);
        for (laptop l : laps) {
            System.out.println(l);
        }
    }
}