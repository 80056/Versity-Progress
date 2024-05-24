import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class googui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hodai");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JButton button =new JButton("Click");

        frame.setSize(400,150);
        frame.setVisible(true);
        frame.add(button);
    }
}
