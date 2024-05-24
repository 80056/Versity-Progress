import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui implements ActionListener {

    JFrame frame = new JFrame();
    JLabel username = new JLabel();
    JTextField usernameInput = new JTextField();
    JLabel password = new JLabel();
    JTextField passwordInput = new JTextField();
    JButton login = new JButton();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (usernameInput.getText().equals("abc") && passwordInput.getText().equals("123")){
            System.out.println("successful");
        }
        else System.out.println("try again");
    }
    public Gui(){
        frame.setSize(600,600);
        username.setBounds(50,50,100,50);
        usernameInput.setBounds(200,50,100,50);
        password.setBounds(50,150,100,50);
        passwordInput.setBounds(200,150,100,50);
        login.setBounds(100,250,100,50);

        username.setText("username");
        password.setText("password");
        login.setText("Login");

        frame.add(username);
        frame.add(usernameInput);
        frame.add(password);
        frame.add(passwordInput);
        frame.add(login);

        login.addActionListener(this);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Gui();
    }
}
