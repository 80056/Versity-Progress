import java.util.ArrayList;
import java.util.Comparator;

public class Address {
    String building_number, area, city;
    int zip_code;
    Address(String building_number, String area, String city,int zip_code){
        this.building_number = building_number;
        this.area = area;
        this.city = city;
        this.zip_code = zip_code;
    }
    int getZip_code(){
        return zip_code;
    }
    public static void main(String[] args) {
        ArrayList<Address> adrs = new ArrayList<>();

        adrs.add(new Address("19/A","hj","huh",1209));
        adrs.add(new Address("19/A","hj","huh",1276));
        adrs.add(new Address("19/A","hj","huh",1208));

        adrs.add(1,new Address("878","jhj","jbgh",8200));
        adrs.add(2,new Address("878","jhj","jbgh",820));

        Comparator<Address> comp = (l1, l2) -> {
            if(l1.getZip_code()>l2.getZip_code()){
                return 1;
            }
            else return -1;
        };
    }
}
