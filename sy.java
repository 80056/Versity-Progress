import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sy implements ActionListener {
    JButton button1; // Declare button1 as a field

    public static void main(String[] args) {
        sy summer = new sy();
        summer.createAndShowGUI();
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(2, 2));

        button1 = new JButton("1"); // Initialize button1 here
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        button1.addActionListener(this); // Add action listener here

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            // Your code for button1's action
        }
    }
}
