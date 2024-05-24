public class TestMain {
    public static void main(String[] args) {
updateScore(new Test ("CT1",10), 15.0f);
    }
    static void updateScore(Test test, float newScore){
        test.score = newScore;
    }
}
