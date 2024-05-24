import java.io.IOException;

public class ThrowThorows {
    public void display() throws Exception {
        System.out.println("this throws an Exception");
    }

    public void ThrowsSystemException() throws IOException {
        System.out.println("this method throws IO Exception");
    }

    public static void main(String[] args) {
        ThrowThorows t = new ThrowThorows();
        try {
            t.display();
            t.ThrowsSystemException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

