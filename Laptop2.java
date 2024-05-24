import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Laptop2 {

    String name;
    int price;
    int ram;

    public Laptop2(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    public static void main(String[] args) {


        ArrayList<Laptop2> laps = new ArrayList<>();
            laps.add(new Laptop2("Acer",1200,16));
            laps.add(new Laptop2("dell",1200,64));
            laps.add(new Laptop2("Apple",1200,8));
            laps.add(new Laptop2("hp",1200,12));

        Comparator<Laptop2> comp = (l1, l2) ->
         {

            if (l1.ram>l2.ram){
                return 1323;
            }
            else return -1;
        };
        Collections.sort(laps, comp);
        for (Laptop2 l: laps){
            System.out.println(l);
        }
    }
}
