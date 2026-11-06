
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends Frame implements ActionListener {

    TextField name, email;
    Checkbox male, female, terms;
    CheckboxGroup gender;
    Choice branch;
    Button submit, reset;
    TextArea result;

    StudentForm() {

        setTitle("Student Registration Form");
        setSize(500, 550);
        setLayout(null);

        // Name
        Label l1 = new Label("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        add(l1);

        name = new TextField();
        name.setBounds(170, 50, 200, 30);
        add(name);

        // Email
        Label l2 = new Label("Email:");
        l2.setBounds(50, 100, 100, 30);
        add(l2);

        email = new TextField();
        email.setBounds(170, 100, 200, 30);
        add(email);

        // Gender
        Label l3 = new Label("Gender:");
        l3.setBounds(50, 150, 100, 30);
        add(l3);

        gender = new CheckboxGroup();

        male = new Checkbox("Male", gender, false);
        male.setBounds(170, 150, 70, 30);
        add(male);

        female = new Checkbox("Female", gender, false);
        female.setBounds(250, 150, 80, 30);
        add(female);

        // Branch
        Label l4 = new Label("Branch:");
        l4.setBounds(50, 200, 100, 30);
        add(l4);

        branch = new Choice();
        branch.add("Computer Engineering");
        branch.add("IT");
        branch.add("Mechanical");
        branch.add("Civil");
        branch.add("Electronics");

        branch.setBounds(170, 200, 200, 30);
        add(branch);

        // Terms
        terms = new Checkbox("Accept Terms and Conditions");
        terms.setBounds(170, 250, 220, 30);
        add(terms);

        // Buttons
        submit = new Button("Submit");
        submit.setBounds(120, 300, 100, 35);
        add(submit);

        reset = new Button("Reset");
        reset.setBounds(250, 300, 100, 35);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        // Result area
        result = new TextArea();
        result.setBounds(50, 360, 400, 130);
        add(result);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            if (name.getText().isEmpty() ||
                email.getText().isEmpty() ||
                gender.getSelectedCheckbox() == null ||
                !terms.getState()) {

                result.setText("Please fill all details and accept terms.");
            } else {

                String g = gender.getSelectedCheckbox().getLabel();

                result.setText(
                    "Registration Successful!\n\n" +
                    "Name: " + name.getText() + "\n" +
                    "Email: " + email.getText() + "\n" +
                    "Gender: " + g + "\n" +
                    "Branch: " + branch.getSelectedItem()
                );
            }
        }

        if (e.getSource() == reset) {
            name.setText("");
            email.setText("");
            gender.setSelectedCheckbox(null);
            terms.setState(false);
            branch.select(0);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
