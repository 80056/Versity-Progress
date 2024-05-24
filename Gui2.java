import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui2 implements ActionListener {
    JFrame frame;
    JTextField n1, n2,n3, Result;
    JButton max,min,avg,clr;

    public Gui2(){

        frame = new JFrame("test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(300,300);
        frame.setSize(500,500);

        frame.setLayout(new FlowLayout());

        n1 = new JTextField(10);
        n2 = new JTextField(10);
        n3 = new JTextField(10);

        Result = new JTextField(10);

        max = new JButton("Max");
        min = new JButton("Min");
        avg = new JButton("Avg");
        clr = new JButton("clr");

        max.addActionListener(this);
        min.addActionListener(this);
        avg.addActionListener(this);
        clr.addActionListener(this);

        frame.add(n1);
        frame.add(n2);
        frame.add(n3);
        frame.add(max);
        frame.add(min);
        frame.add(avg);
        frame.add(clr);
        frame.add(Result);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==max){
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                double num3 = Double.parseDouble(n3.getText());

                double max = num1;
                if(max<num2){
                    max = num2;
                    Result.setText(""+max);
                }
                if(max<num3){
                    max = num3;
                    Result.setText(""+max);
                }
                else {
                    max = num1;
                    Result.setText(""+max);
                }
            }
            else if(e.getSource()==min){
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                double num3 = Double.parseDouble(n3.getText());

                double min = num1;
                if(min>num2){
                    min = num2;
                    Result.setText(""+min);
                }
                if(min>num3){
                    min = num3;
                    Result.setText(""+min);
                }
                else {
                    min = num1;
                    Result.setText(""+min);
               }
           }
            else if(e.getSource()==avg){
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                double num3 = Double.parseDouble(n3.getText());

                double sum = (num1+num2+num3)/3;
                Result.setText(" "+sum);

            } else if (e.getSource() == clr) {
                Result.setText(" ");
            }
    }

    public static void main(String[] args) {
        new Gui2();
    }
}
