import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberCalculatorGUI extends JFrame implements ActionListener {

    private final JTextField n1;
    private final JTextField n2;
    private final JTextField n3;
    private final JTextField result;
    JButton maxButton;
    JButton minButton;

    public NumberCalculatorGUI() {
        super("Number Calculator");
        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("num1:");
        add(label1);
        n1 = new JTextField(10);
        add(n1);

        JLabel label2 = new JLabel("num2:");
        add(label2);
        n2 = new JTextField(10);
        add(n2);

        JLabel label3 = new JLabel("num3:");
        add(label3);
        n3 = new JTextField(10);
        add(n3);

        JButton maxButton = new JButton("Max");
        maxButton.addActionListener(this);
        add(maxButton);

        JButton minButton = new JButton("Min");
        minButton.addActionListener(this);
        add(minButton);

        JButton avgButton = new JButton("Avg");
        avgButton.addActionListener(this);
        add(avgButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

        JLabel resultLabel = new JLabel("Result:");
        add(resultLabel);
        result = new JTextField(10);
        result.setEditable(false);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== maxButton) {
           result.setText(result.getText().concat(String.valueOf(n1)));
            }
        }

    public static void main(String[] args) {
        new NumberCalculatorGUI();
    }
    }
