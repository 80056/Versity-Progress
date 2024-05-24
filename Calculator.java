import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton button1, button2, plus, minus, equal;
    double num1 = 0, num2 = 0, result = 0;
    JPanel panel;

    public Calculator(){
        frame = new JFrame("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);

        button1 = new JButton();
        button2 = new JButton();
        plus = new JButton();
        minus = new JButton();
        equal = new JButton();

        button1.addActionListener(this);
        button2.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        equal.addActionListener(this);



        add(frame);
        add(textField);

        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
