public class SuperHero {
    public String name,power;
    public SuperHero(String name, String power){
        this.name=name;
        this.power=power;
        System.out.println("I am SuperHero");
    }
    {
        System.out.println("American SuperHero");
    }
    {
        System.out.println("SuperHero has power");
    }
    public void show(){
        System.out.println(name+","+power);
    }
    public void create(String name,String power){
        SuperHero a = new SuperHero(name,power);
        a.show();
    }
}//end of SuperHero Class;
