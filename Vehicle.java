public class Vehicle {
        private String brand;
        private String model;
        static {                       //STATIC BLOCK    --1
            System.out.println("Initializing Vehicle class...");
        }
        {                              //NONSTATIC BLOCK  --3
            System.out.println("Initializing an instance of the Vehicle class..."); }
        public Vehicle() {            //CONSTRUCTOR      --4
            System.out.println("Creating a default vehicle.");
            brand = "Unknown";
        }
        public Vehicle(String brand, String model) {
            System.out.println("Creating a customized vehicle of brand: " + brand + " and model: " + model);
            this.brand=brand;
            this.model = model;
        }
        public void honk() {
            System.out.println("The vehicle emits a honking sound.");
        }
    public void honk(String sound) {
        System.out.println("The vehicle emits a custom honking sound: " + sound);
    }
     static{                             //STATIC BLOCK      --2
        System.out.println("Making sure of initialization...");
     }
    public void info() {
        System.out.println("model="+model+" brand="+brand);
    }
    public static void main(String[] args) {      // START
        Vehicle defaultVehicle = new Vehicle();   //--0
        defaultVehicle.honk();
        defaultVehicle.info();
        Vehicle truck = new Vehicle("Ford", "F- 150");
        truck.honk("Loud horn sound");
        truck.info();
    }
}
