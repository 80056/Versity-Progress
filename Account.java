import javax.swing.*;

public class Account {
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
        System.out.println(balance);
        C.balance = C.balance + amount;
        System.out.println(balance);
    }
    public static void main(String[] args) {
        Account A = new Account(1, "a", 100);
        Account B = new Account(2, "b", 100);

        int a = 10;
        A.transfer(a);
        System.out.println(a);
        A.transfer(B, 10);
        B.transfer(A, 10);
//        System.out.println(a);
        System.out.println(A.balance + " " + B.balance);
    }
}

