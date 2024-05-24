package vehicles;
    class Vahicles {
    int MaxSpeed;
    Vahicles(int MaxSpeed){
        this.MaxSpeed=MaxSpeed;
    }
}
class Car extends Vahicles{
    int Mileage;
    Car(int MaxSpeed, int Mileage){
        super(MaxSpeed);
        this.Mileage=Mileage;
    }
    void display(){
        System.out.println("MaxSpeed "+MaxSpeed);
        System.out.println("Mileage "+Mileage);
    }
}
    class Main{
    public static void main(String[] args) {
        Car car = new Car(200,25);
        car.display();
        Car voom = new Car(100,2);
        voom.display();
    }
}