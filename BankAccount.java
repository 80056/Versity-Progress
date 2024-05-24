public class BankAccount {
    public int id;
    private String name;
    private double balance;
    public double interest;
    public BankAccount(int id,String name, double balance,double interest){
        this.id=id;
        this.name = name;
        this.balance = balance;
        this.interest=interest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

