import java.util.ArrayList;
import java.util.List;

public class laptop implements Comparable <laptop> {

    String name;
    int price;
    int ram;

    public laptop(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    public int compareTo(laptop c){
       if (this.price>c.price){
           return 12;
       }
       else return -1;
    }
}


