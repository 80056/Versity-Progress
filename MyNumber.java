public class MyNumber {
    private int number;
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    class EncapTest{
        public static void main(String[] args) {
            MyNumber num = new MyNumber();
            num.setNumber(420);
            System.out.println(num.getNumber());
        }
    }
}