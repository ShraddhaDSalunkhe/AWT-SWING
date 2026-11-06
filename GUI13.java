
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {

    JTextField name, email;
    JRadioButton male, female;
    ButtonGroup gender;
    JCheckBox terms;
    JComboBox<String> branch;
    JButton submit, reset;
    JTextArea result;

    StudentForm() {

        setTitle("Student Registration Form");
        setSize(500, 550);
        setLayout(null);

        // Student Name
        JLabel l1 = new JLabel("Student Name:");
        l1.setBounds(50, 40, 120, 30);
        add(l1);

        name = new JTextField();
        name.setBounds(180, 40, 200, 30);
        add(name);

        // Email
        JLabel l2 = new JLabel("Email:");
        l2.setBounds(50, 90, 120, 30);
        add(l2);

        email = new JTextField();
        email.setBounds(180, 90, 200, 30);
        add(email);

        // Gender
        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(50, 140, 120, 30);
        add(l3);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(180, 140, 80, 30);
        female.setBounds(270, 140, 100, 30);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        add(male);
        add(female);

        // Branch
        JLabel l4 = new JLabel("Branch:");
        l4.setBounds(50, 190, 120, 30);
        add(l4);

        String branches[] = {
            "Computer Engineering",
            "IT",
            "Mechanical",
            "Civil",
            "Electronics"
        };

        branch = new JComboBox<>(branches);
        branch.setBounds(180, 190, 200, 30);
        add(branch);

        // Terms and Conditions
        terms = new JCheckBox("Accept Terms and Conditions");
        terms.setBounds(180, 240, 220, 30);
        add(terms);

        // Submit Button
        submit = new JButton("Submit");
        submit.setBounds(120, 290, 100, 35);
        add(submit);

        // Reset Button
        reset = new JButton("Reset");
        reset.setBounds(250, 290, 100, 35);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        // Result Area
        result = new JTextArea();
        result.setEditable(false);

        JScrollPane sp = new JScrollPane(result);
        sp.setBounds(50, 350, 400, 130);
        add(sp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            if (name.getText().trim().isEmpty() ||
                email.getText().trim().isEmpty() ||
                (!male.isSelected() && !female.isSelected()) ||
                !terms.isSelected()) {

                result.setText(
                    "Please fill all details and accept terms."
                );

            } else {

                String g = male.isSelected() ? "Male" : "Female";

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

            gender.clearSelection();

            terms.setSelected(false);

            branch.setSelectedIndex(0);

            result.setText("");
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new StudentForm();
        });
    }
}
