public class SuperMan {
    public void fun1(String name, String power){
        SuperHero b = new SuperHero(name, power);
        b.create("Bob","Jump");
        b.show();
    }

    public static void main(String[] args) {
        SuperMan c = new SuperMan();
        c.fun1("Tim","Fly");
        SuperHero d = new SuperHero("Maggi","Kick");
        d.show();
    }
}