import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class convertion  implements ActionListener {

    JFrame frame;
    JLabel inch, mm;
    JButton button, button2;
    JTextField textField1, textField2;

    public convertion(){
        frame = new JFrame("Inch to MM");
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,800);
        frame.setLayout(null);

        button = new JButton("to inch");
        button.setSize(100,50);
        button.setLocation(265,250);
        button.addActionListener(this);

        button2 = new JButton("to foot");
        button2.setSize(100,50);
        button2.setLocation(370,250);
        button2.addActionListener(this);

        textField1 = new JTextField();
        textField1.setSize(240,50);
        textField1.setLocation(170,100);

        textField2 = new JTextField();
        textField2.setSize(240,50);
        textField2.setLocation(170,350);

          frame.add(button);
          frame.add(button2);
          frame.add(textField1);
          frame.add(textField2);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            double num = Double.parseDouble(textField1.getText());
            double sum = num*10;
            textField2.setText(" "+sum);
        }
        else if (e.getSource() == button2){
            double num1 = Double.parseDouble(textField1.getText());
            double sum1 = num1/12;
            textField2.setText(" "+sum1);
        }

    }

    public static void main(String[] args) {
        new convertion();
    }
}
