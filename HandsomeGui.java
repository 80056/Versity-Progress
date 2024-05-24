import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandsomeGui extends JFrame implements ActionListener {

    int buttonCount = 1;
    JPanel panel ;
    JButton button ;
    JFrame frame;

    public HandsomeGui(){
        frame = new JFrame("MagicButton");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550,550);

        setLayout(new FlowLayout());

        panel = new JPanel();

        button = new JButton("ADD");
        button.addActionListener(this);

        add(panel);
        panel.add(button);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
                if (e.getSource() == button){
                    JButton newButton = new JButton("B"+buttonCount);
                    panel.add(newButton);
                    buttonCount++;

                    revalidate();
                    repaint();
                }
    }

    public static void main(String[] args) {
        new HandsomeGui();
    }
}
