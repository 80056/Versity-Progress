import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicButtonGUI extends JFrame {
    private JPanel buttonPanel;
    private JButton addButton;
    private int buttonCount = 1;

    public DynamicButtonGUI() {
        setTitle("Dynamic Button GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create a panel for buttons
        buttonPanel = new JPanel(new FlowLayout());
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Create the ADD button
        addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewButton();
            }
        });
        mainPanel.add(addButton, BorderLayout.SOUTH);

        // Add the main panel to the frame
        add(mainPanel);

        // Set frame size and visibility
        setSize(300, 200);
        setVisible(true);
    }

    private void addNewButton() {
        JButton newButton = new JButton("b" + buttonCount);
        buttonPanel.add(newButton);
        buttonCount++;
        revalidate(); // Update the layout
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DynamicButtonGUI();
            }
        });
    }
}
