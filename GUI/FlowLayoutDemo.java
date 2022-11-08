package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6;

    public FlowLayoutDemo() {
        super("D. Ohannn");
        setLayout(new BorderLayout(3 ,3));
        b1 = new JButton("Button 1"); add(b1, BorderLayout.NORTH);
        b2 = new JButton("Button 2"); add(b2, BorderLayout.SOUTH);
        b3 = new JButton("Button 3"); add(b3, BorderLayout.CENTER);
        b4 = new JButton("Button 4"); add(b4, BorderLayout.EAST);
        b5 = new JButton("Button 5"); add(b5, BorderLayout.WEST);

//        setLayout(new FlowLayout());
//        setLayout(new GridLayout(3,2,5,10));
//        b1 = new JButton("Button 1"); add(b1);
//        b2 = new JButton("Button 2"); add(b2);
//        b3 = new JButton("Button 3"); add(b3);
//        b4 = new JButton("Button 4"); add(b4);
//        b5 = new JButton("Button 5"); add(b5);
//        b6 = new JButton("Button 6"); add(b6);
    }

    public static void main(String[] args) {
        FlowLayoutDemo f = new FlowLayoutDemo();
        f.setFrame();
    }

    public void setFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }
}
