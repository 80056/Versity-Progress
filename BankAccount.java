public class BankAccount {
    public String name;
    public String ID;
    public double balance;
    //method
    public void deposit(double amount){
        balance = balance+amount;
    }
    public void withdraw (double amount){
        if (amount<balance){
            balance -= amount;
        }
    }

    public static void main(String[] args) {
       BankAccount acc1 = new BankAccount();
       System.out.println(acc1.name );
       System.out.println(acc1.ID);
       System.out.println(acc1.balance);
    }
}
