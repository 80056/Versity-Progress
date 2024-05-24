public class PassValueWithObject {
    public static void main(String[] args) {
        Test t = new Test ("CT1",10);
        t.display();
        UpdateValue(t,15.0f);
        t.display();
    }
    static void UpdateValue(Test Newtest, float NewScore ){ // t -----> | TestName = CT1;
        Newtest.score = NewScore;                          //           | score = 10;
    }                                                     //  Test NewTest = t  | Here, NewTest will refer to t which already refering to test in line 3; (vide no.7 == 48:00/Fahim Shariar)
}
