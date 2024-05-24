public  class testThrow{
    public void testException () throws Exception{
        throw new Exception();
    }
    public void testSystemException () throws InterruptedException{
        Thread.sleep(1000);
    }
}
class TestMain{
    public static void main(String[] args) {
        testThrow ob = new testThrow();

        try {
            ob.testSystemException();
            ob.testException();
        }
        catch (InterruptedException e){

        }
        catch (Exception e1){
            
        }
    }
}