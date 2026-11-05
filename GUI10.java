
import java.awt.*;
import java.awt.event.*;

class LoginForm extends Frame implements ActionListener {

    Label l1, l2, result;
    TextField t1, t2;
    Button b1;

    LoginForm() {

        setTitle("Login Form");
        setSize(350, 250);
        setLayout(new FlowLayout());

        l1 = new Label("Username:");
        t1 = new TextField(20);

        l2 = new Label("Password:");
        t2 = new TextField(20);
        t2.setEchoChar('*');

        b1 = new Button("Login");
        result = new Label("");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(result);

        b1.addActionListener(this);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        String username = t1.getText();
        String password = t2.getText();

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
