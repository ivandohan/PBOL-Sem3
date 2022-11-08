package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame{
    private JButton b1, b2, b3, b4, b5, b6;

    public LayoutDemo() {
        super("Layout Demo");
        setLayout(new GridLayout(2,1));
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());
        add(p1); add(p2);

        b1 = new JButton("Button 1"); p1.add(b1);
        b2 = new JButton("Button 2"); p1.add(b2);
        b3 = new JButton("Button 3"); p2.add(b3);
        b4 = new JButton("Button 4"); p2.add(b4);
        b5 = new JButton("Button 5"); p2.add(b5);
        b6 = new JButton("Button 6"); p2.add(b6);
    }

    public static void main(String[] args) {
        LayoutDemo l = new LayoutDemo();
        l.setFrame();
    }

    public void setFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }
}
