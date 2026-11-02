import javax.swing.*;

class SwingInput {
    public static void main(String args[]) {

        JFrame f = new JFrame("Swing Input Form");

        JLabel l = new JLabel("Enter Your Name:");
        l.setBounds(50, 70, 120, 30);

        JTextField t = new JTextField();
        t.setBounds(180, 70, 150, 30);

        JButton b = new JButton("Submit");
        b.setBounds(120, 130, 100, 40);

        b.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                f, "Hello " + t.getText()
            );
        });

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(400, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
