class Aa{
    int i, j;
    //    void show(){
//        System.out.println("show in A");
//    }
    public Aa(){
        this.i = this.j = 10;
    }
    public Aa(int a){
        this.i = this.j = a;
    }
    public Aa(int i, int j){
        System.out.println("in class A");
        this.i = i;
        this.j = j;
    }
}

class Bb extends Aa{
    int k;
    void show(){
        System.out.println("show in B");
    }
    public Bb(){
        super();
//        this.i = this.j =
        this.k = 10;

    }
    public Bb(int a){
        super(a);
//        this.i = this.j =
        this.k = a;
    }
    public Bb(int i, int j, int k){

        super(i, j);
        System.out.println("in class B");
//        this.i = i;
//        this.j = j;
        this.k = k;
    }
}
class Inheritance {
    public static void main(String[] args) {
//        B b = new B(6, 6, 6);
//        System.out.println(b.i);
        Aa a = new Bb(1, 2, 3);
        ((Bb)a).show();
        // a.show() doesn't work -- check this case
    }
}