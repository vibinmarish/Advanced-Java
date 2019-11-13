import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class exampleswing implements ActionListener {
    JFrame f = new JFrame();
    JTextField t = new JTextField();
    JButton b = new JButton("Submit");
    JLabel l = new JLabel();

    exampleswing() {
        f.add(t);
        b.addActionListener(this);
        f.add(b);
        f.add(l);
        t.setBounds(100, 100, 100, 100);
        l.setBounds(20, 20, 20, 20);
        b.setBounds(50, 50, 50, 50);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = t.getText();
        l.setText(s);
    }
}

public class swingsexample {
    public static void main(String args[]) {
        exampleswing s = new exampleswing();
    }
}
