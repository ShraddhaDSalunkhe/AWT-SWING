import java.awt.*;

class AWTExample {
    public static void main(String args[]) {

        Frame f = new Frame("AWT Example");

        Label l = new Label("Welcome to Java");
        l.setBounds(100, 80, 150, 30);

        Button b = new Button("Click Me");
        b.setBounds(100, 130, 100, 40);

        b.addActionListener(e -> {
            l.setText("Button Clicked!");
        });

        f.add(l);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
