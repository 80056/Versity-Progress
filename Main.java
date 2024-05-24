class Main{
    public static void main(String[] args) {
     BankAccount a = new BankAccount(01,"rajee",5000,10);
     System.out.println("Id : " +a.id+" Name: "+a.getName()+" Balance: "+a.getBalance()+" Interest: "+a.interest+"%");
     a.setName("MAHMUD");
     System.out.println("\n");
     System.out.println("Id : " +a.id+" Name: "+a.getName()+" Balance: "+a.getBalance()+" Interest: "+a.interest+"%");


    }

}