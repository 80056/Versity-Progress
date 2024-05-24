import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class newgui extends JFrame implements ActionListener {

    int buttonCount = 1;

    JButton addbutton;
    JPanel panel;
    JFrame frame;

    public newgui(){
      frame = new JFrame("NewGui");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(420,550);

        setLayout(new FlowLayout());

        panel = new JPanel();

        addbutton = new JButton("ADD");
//
        addbutton.addActionListener(this);
//
         add(panel);
//
         panel.add(addbutton);
         setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == addbutton){
                JButton newButton = new JButton("b"+buttonCount);
                panel.add(newButton);
                buttonCount++;

                revalidate();
                repaint();
            }
    }

    public static void main(String[] args) {
        new newgui();
    }
}
