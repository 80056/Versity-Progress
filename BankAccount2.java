public class BankAccount2 {
    public String name;
    public double id;
    public double Balance;
    public void deposit (double amount){
        Balance += amount;
    }
    public void withdraw(double amount) {
        if (amount < Balance) {
            Balance -= amount;
        }
    }
    public static void main (String[] args){
        BankAccount2 acc1 = new BankAccount2();
        acc1.name = "json";
        acc1.id = 878;
        acc1.Balance = 9987;
        System.out.println("initial :"+acc1.name);
        System.out.println("initial :"+acc1.id);
        System.out.println("initial :"+acc1.Balance);
        acc1.deposit(5000);
        System.out.println("After deposit :"+acc1.name);
        System.out.println("After deposit :"+acc1.id);
        System.out.println("After deposit :"+acc1.Balance);
        acc1.withdraw(4500);
        System.out.println("After withdraw :"+acc1.name);
        System.out.println("After withdraw :"+acc1.id);
        System.out.println("After withdraw :"+acc1.Balance);

    }
}
