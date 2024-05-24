public class Test {
    String TestName;
    float score;
    public Test(String TestName, float score){
        this.TestName = TestName;
        this.score = score;
    }

    void display(){
      System.out.println("TestName = & score = "+TestName+score);
    }
}