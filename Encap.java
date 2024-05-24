
public class Encap {
    private String Name;
    private float id;
    public float Balance;
    public Encap(float Balance){
        this.Balance= Balance;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setID(float id){
        this.id = id;
    }
    public float getID(){
        return id;
    }
}
class Cat extends Encap{
    public int x = 10;
    public int y = 20;
    public Cat(int x, int y){
        super(786777);
        this.x = x;
        this.y= y;
    }

    public static void main(String[] args) {
        Cat C =  new Cat(10,80);
        System.out.println(C.Balance);
    }

}
class EncapTest{
    public static void main(String[] args) {
        Encap A = new Encap(65778.98f);
        A.setName("Rajee");
        System.out.println(A.getName());
        System.out.println("Balance = "+A.Balance);
    }
}
class A{
    public void show(){
        System.out.println("Birds Can Fly");
    }
}
class B extends A{
    public void show(){
        System.out.println("The Sky is blue");
    }
    public static void main(String[] args) {
       B display = new B();
       display.show();
    }
}
class InvokeOverrideMethod{
    public String DeptName = "hello this is dept";
    public int salary = 50000;
    public void show() {
        System.out.println(salary + "," + DeptName);
    }
}
class CallingOverrideMethod extends InvokeOverrideMethod {
    public String dep = "Eng";
InvokeOverrideMethod ob1 = new InvokeOverrideMethod();
public void show(){
    super.show();
    System.out.println(" "+dep);
}
}
class Man{
    private int weight;
    public Man(int weight){
    this.weight=weight;
}
    public void setWeight(int weight) {
        if (weight >=50 && weight<=100){
            this.weight = weight;
        }
    }
    public int getWeight() {

        return weight;
    }
 public void show()
 {
     System.out.println(weight);

 }
} // End of Man class;
 class SuperMan extends Man{
    public int power;
    public SuperMan(int power){
        super(40);
        this.power = power;
    }
    public SuperMan(int weight, int power){
        super(weight);
        this.power = power;
    }
    public void show(){
        super.show();
        System.out.println(power);
    }
    public void show(String abc){
        System.out.println(abc);
    }
     public static void main(String[] args) {
         SuperMan S = new SuperMan(10);
         S.show();
         SuperMan S1 = new SuperMan(6,100);
         S1.show("Tiger");
     }
}
class Mid {
    int x = 10;
    {
        x = 20;
        System.out.println("@Block=" + x);
    }
    Mid(int x1, int x2) {
        x = x1 + x2;
        System.out.println("@Constructor-2=" + x);
    }
    Mid(int x1) {
        this(100, 200);
        x = x1;
        System.out.println("@Constructor-1=" + x);
    }
    Mid() {
        this(50);
        x = 30;
        System.out.println("@Constructor-0=" + x);
    }
}
 class InitBlock {
    public static void main(String[] args) {
        Mid obj1 = new Mid(30);
        System.out.println("@End=" + obj1.x);
    }
}
class Car{
    public void abc(){
        System.out.println("This is a car class");
    }
}
class Bus{
    public void xyz(){
        System.out.println("This is a Bus Class");
    }
}
class TestInstanceof {
    public void test (Object obj) {
      if(obj instanceof Car){
          Car u = new Car();
          u.abc();
      }
      else if (obj instanceof Bus){
          Bus n = new Bus();
          n.xyz();
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        Bus b = new Bus();
        TestInstanceof t = new TestInstanceof();
        t.test(c);
        t.test(b);
    }
}
class TestEqual{
    int x;
    int y;
    public TestEqual(int x, int y){
        this.x=x;
        this.y=y;
    }
    public boolean equals(Object obj){
        boolean result = false;
        if((obj!=null) && (obj instanceof TestEqual)){
            TestEqual t = (TestEqual) obj;//*****?// // variable type--> (TestEquals) variable name--> (t) assignment operator (=)
            if((x==t.x)&&(y==t.y)){       // type casting--> (TestEquals) Object reference--> (obj)
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TestEqual t1= new TestEqual(5,10);
        TestEqual t2= new TestEqual(5,10);
        if (t1 == t2){
            System.out.println("t1 identical to t2");
        }
        else System.out.println("t1 not identical to t2");
        if (t1.equals(t2)){
            System.out.println("t1 equal to t2");
        }
        else System.out.println("t1 not equal to t2");
        System.out.println("Set t1 = t2");
        t2 = t1;
        if(t1 == t2){
            System.out.println("t1 identical to t2");
        }
        else System.out.println("t1 is not identical to t2");
    }
}
class TestToString{
    public static void main(String[] args) {
        TestToString now = new TestToString();
        System.out.println(now);
        //is equivalent to
        System.out.println(now.toString());
    }
}
class TestStatic{
    String name;
    int id;
    static String uniname = "uiu";
    public TestStatic(int id, String name){
        this.id= id;
        this.name= name;
    }
    static{
        System.out.println("static first block");
    }
    {
        System.out.println("static 2nd block");
    }
    {
        System.out.println("non static 1st block");
    }
    {
        System.out.println("non static 2nd block");
    }
}
class display{
    TestStatic t = new TestStatic(87,"rajee");
    public void show(){
        System.out.println("name ="+t.name);
        System.out.println("id ="+t.id);
        System.out.println("uni ="+t.uniname);
class Comics{
    public void foo(){
        System.out.println("foo");
    }
    public void bar(){
        System.out.println("bar");
    }
}
class Marvel extends Comics{
    public Marvel(){
        this(1000); // this current class er instances, variables and method er shathe shomporkito.
    }
    public Marvel(int val){
        System.out.println("Value: " + val);
    }
    public void foo(){
        super.foo();
        System.out.println("Tony Stark");
    }
    public void foo(double val){
        System.out.println("Steve Rogers");
        System.out.println("Value: " + val);
    }
    public void fubar(){
        bar();
    }
}
class Main {
    public static void main(String[] args) {
        Marvel obj = new Marvel();
        obj.foo();
        obj.foo(50);
        obj.fubar();
        }
       }
       }
    }