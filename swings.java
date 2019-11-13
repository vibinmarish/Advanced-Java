import java.awt.event.*;
import javax.swing.*;

class swingclass implements ActionListener {
    JFrame f = new JFrame();
    JTextField t = new JTextField("Enter Number");
    JTextField t1 = new JTextField("Enter Number");
    JLabel l = new JLabel();
    JButton b = new JButton("ADD");

    swingclass() {
        f.add(t);
        f.add(t1);
        f.add(l);
        b.addActionListener(this);
        f.add(b);
        t.setBounds(150, 50, 150, 20);
        t1.setBounds(150, 100, 150, 20);
        l.setBounds(50, 50, 150, 20);
        b.setBounds(50, 100, 150, 20);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int s = Integer.parseInt(t.getText());
        int s1 = Integer.parseInt(t1.getText());
        int c = s + s1;
        l.setText(String.valueOf(c));

    }
}

public class swings {
    public static void main(String args[]) {
        swingclass sw = new swingclass();

    }
}
