import javax.swing.*;

class Account {
    int id;
    String name;
    double balance;
    public Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    void add(double amount){
        this.balance = this.balance + amount;
    }

    void subtract(double amount){
        this.balance = this.balance - amount;
    }

    void transfer(int c){
        c = c - 10;
    }
    void transfer(Account C, double amount){
        this.balance = this.balance - amount;
        C.balance = C.balance + amount;
    }
    public static void main(String[] args) {
        Account A = new Account(1, "a", 100);
        Account B = new Account(2, "b", 100);
//        System.out.println(A.balance);//100
//        A.add(10);
//        System.out.println(A.balance);//110
//        A.subtract(10);
//        System.out.println(A.balance);//100
        int a = 10;
        A.transfer(a);
        System.out.println(a);
        A.transfer(B, 10);
        B.transfer(A, 10);
//        System.out.println(a);
        System.out.println(A.balance + " " + B.balance);
    }
}

class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point p){
        double a = this.x - p.x;
        double b = this.y - p.y;
        double dist = Math.sqrt(a * a + b * b);
        return dist;
    }
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        double distance = p1.distance(p2);
        System.out.println("distance = " + distance);
    }
}
