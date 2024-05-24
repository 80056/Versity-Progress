import org.w3c.dom.ls.LSOutput;

class Myobject {
    private double r;
    public double findVolume(){
        return -1.0;
    }
    public Myobject(double x){
        r = x;
    }
    public double getr(){
        return r;
    }
    {
        System.out.println("in non 1");
    }
    static{
        System.out.println("in stat 1");
    }
    {
        System.out.println("in non 2");
    }
    static{
        System.out.println("in stat 2");
    }
}

class Sphere extends Myobject{
    public double findVolume(){
        double r1 = getr();
        double x = 3.0/4.0*Math.PI * Math.pow(r1, 3);
        return x;
    }
    public Sphere(double x){
        super(x);
    }
}
class Cylinder extends Myobject{
    private double h;
    public double findVolume(){
        double r1 = getr();
        double x = Math.PI * r1*r1*h;
        return x;
    }
    public Cylinder(double x, double y){
        super(x);
        h = y;
    }
    public double geth(){
        return h;
    }
}
class Cone extends Cylinder{
    public double findVolume(){
        double r1 = getr();
        double h1 = geth();
        double x = Math.PI * r1*r1*h1/3.0;
        return x;
    }
    public Cone(double x, double y){
        super(x, y);
    }
}
class JavaApplication5 {
    public static void main(String[] args) {
        Myobject [] sp = new Myobject[5];
//r = 2.5, 1.9, 1.5, 2.7, 3.5;
//h = 8.9, 6.5, 5.7
        sp[0] = new Sphere(2.5);
        sp[1] = new Cone(1.9, 8.9);
        sp[2] = new Cylinder(1.5, 6.5);
        sp[3] = new Cone(2.7, 5.7);
        sp[4] = new Sphere(3.5);
        double v = 0.0;
        double t ;
        for(int i = 0; i < 5; i++){
            t = sp[i].findVolume();
            System.out.println("Individual volume = " + t);
            v += t;
        }
        System.out.println("Total volume: " + v);
    }
}