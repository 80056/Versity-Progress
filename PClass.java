public class PClass{
    void mFnc(){
        System.out.println("Hello from p class");
    }
    void mFnc(double d1){
        System.out.println("double value: "+d1);
    }
}
class CClass extends PClass{
    void mFnc(){
        System.out.println("Hello from c class");
        super.mFnc(11.22);
    }
    void mFnc(int a2, double d2){
        super.mFnc(d2);
        System.out.println("integer value : "+a2);
    }
}
class main {
    public static void main(String[] args) {
        PClass pobj = new PClass();
        CClass cobj = new CClass();

        pobj.mFnc();
        cobj.mFnc();
        cobj.mFnc(10,2.99);
        cobj.mFnc(3.145);
    }
}