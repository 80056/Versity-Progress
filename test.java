public class test1 {
    static{
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
    {
        System.out.println("non static block");
    }
}

public void main(String[] args) {
    test1 t = new test1();
}