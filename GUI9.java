import java.awt.*;

class AWTComponents {
    public static void main(String args[]) {

        Frame f = new Frame("AWT Components");

        // Checkbox
        Checkbox c1 = new Checkbox("Java");
        c1.setBounds(50, 60, 100, 30);

        // CheckboxGroup (Radio Buttons)
        CheckboxGroup bg = new CheckboxGroup();

        Checkbox r1 = new Checkbox("Male", bg, false);
        r1.setBounds(50, 110, 100, 30);

        Checkbox r2 = new Checkbox("Female", bg, false);
        r2.setBounds(50, 150, 100, 30);

        // Choice (Dropdown)
        Choice ch = new Choice();
        ch.add("C");
        ch.add("C++");
        ch.add("Java");
        ch.setBounds(50, 200, 150, 30);

        f.add(c1);
        f.add(r1);
        f.add(r2);
        f.add(ch);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
