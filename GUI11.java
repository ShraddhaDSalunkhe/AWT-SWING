
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame implements ActionListener {

    JLabel l1, l2, result;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    LoginForm() {

        setTitle("Login Form");
        setSize(350, 250);
        setLayout(new FlowLayout());

        l1 = new JLabel("Username:");
        t1 = new JTextField(20);

        l2 = new JLabel("Password:");
        t2 = new JPasswordField(20);

        b1 = new JButton("Login");
        result = new JLabel("");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(result);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String username = t1.getText();
        String password = new String(t2.getPassword());

        if(username.equals("admin") && password.equals("1234")) {
            result.setText("Login Successful!");
        }
        else {
            result.setText("Invalid Username or Password!");
        }
    }

    public static void main(String args[]) {
        new LoginForm();
    }
}
