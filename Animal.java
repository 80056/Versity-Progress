public abstract class Animal {
    String name, color;
    double weight;
    Animal(){
    }
    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    Animal(String name, String color){
        this(name, color, 0.0);
    }
    public void eat(){
        System.out.println(name+" eats");
    }
    public abstract void makeSound();
}
class bird extends Animal{
    public bird (){
        name = "bird";
    }
    public void makeSound(){
        System.out.println("chirp");
    }
}
class tiger extends Animal{
    public tiger(){
        name = "tiger";
    }
    public void makeSound(){
        System.out.println("Roar");
    }
}
class main{
    public static void main(String[] args) {
        Animal r;
        r = new bird();
        r.makeSound();
        r = new tiger();
        r.makeSound();
    }
}
interface Flyable{
    public static final String media = "Sky";
    public abstract void fly();
    public abstract boolean NeedFuel();
}
interface Floatable{
    void canfloat();
}
class Bird implements Flyable, Floatable{
    public void fly(){
        System.out.println("Bird fly in the :"+Flyable.media);
    }
    public boolean NeedFuel(){
        return false;
    }
    public void canfloat(){
        System.out.println("Yes");
    }
}