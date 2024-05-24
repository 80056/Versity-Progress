import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Summer22 implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    public Summer22() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(2, 2));

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        button1.addActionListener(this);
        button4.addActionListener(this);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1)
        {
            System.out.println("Image 1");

        }
        if (e.getSource() == button4)
        {
            System.out.println("Image 2");

        }
    }
    public static void main(String[] args) {
        new Summer22();

    }
}


