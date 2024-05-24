import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField resultTextField; // Text field to display result
    private JButton button1, button2, addButton, subtractButton, equalButton; // Buttons for 1, 2, +, -, and =
    private int operand1 = 0; // first operand
    private int operand2 = 0; // second operand
    private char operator = ' '; // operator (+ or -)

    public SimpleCalculator() {
        setTitle("Simple Calculator"); // Set title of the window
        setSize(600, 600); // Set size of the window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Set default close operation


        resultTextField = new JTextField(10); // Create text field with initial size
        resultTextField.setEditable(false); // Make text field non-editable

        button1 = new JButton("1"); // Create button for digit 1
        button2 = new JButton("2"); // Create button for digit 2
        addButton = new JButton("+"); // Create button for addition
        subtractButton = new JButton("-"); // Create button for subtraction
        equalButton = new JButton("="); // Create button for equals

        // Add ActionListener to buttons
        button1.addActionListener(this); // Add action listener to button 1
        button2.addActionListener(this); // Add action listener to button 2
        addButton.addActionListener(this); // Add action listener to addition button
        subtractButton.addActionListener(this); // Add action listener to subtraction button
        equalButton.addActionListener(this); // Add action listener to equals button

        // Add components to JFrame
        add(button1); // Add button 1 to the frame
        add(button2); // Add button 2 to the frame
        add(addButton); // Add addition button to the frame
        add(subtractButton); // Add subtraction button to the frame
        add(equalButton); // Add equals button to the frame
        add(resultTextField); // Add text field to display result to the frame

        setLayout(new FlowLayout()); // Set layout manager for the frame
        setVisible(true); // Set frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Perform actions based on which button is clicked
         if (e.getSource() == addButton) {
            setOperator('+'); // If addition button is clicked, set operator to +
        } else if (e.getSource() == subtractButton) {
            setOperator('-'); // If subtraction button is clicked, set operator to -
        } else if (e.getSource() == equalButton) {
            calculateResult(); // If equals button is clicked, calculate the result
        }
    }

    private void setOperator(char op) {
        operator = op; // Set operator
        resultTextField.setText(resultTextField.getText() + op); // Update text field with operator
    }

    private void calculateResult() {
        int result = 0; // Variable to store result
        if (operator == '+') {
            result = operand1 + operand2; // Perform addition
        } else if (operator == '-') {
            result = operand1 - operand2; // Perform subtraction
        }
        resultTextField.setText(String.valueOf(result)); // Update text field with result

        // Reset operands and operator
        operand1 = result; // Store result as new operand1
        operand2 = 0; // Reset operand2
        operator = ' '; // Reset operator
    }

    public static void main(String[] args) {
        new SimpleCalculator(); // Create an instance of SimpleCalculator
    }
}
