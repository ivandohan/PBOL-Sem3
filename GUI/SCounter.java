package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SCounter extends JFrame {
    private JTextField tfCount;
    private JButton btn;
    private int count = 0;

    public SCounter() {
        super("Counter");
        setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
        add(new JLabel("Counter"));
        tfCount = new JTextField("0");
        tfCount.setBounds(50,50, 150,20);
        tfCount.setEditable(false);
        add(tfCount);
        btn = new JButton("Count");
        add(btn);
        btn.addActionListener(new ButtonClickListener());
    }

    public class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            count++; tfCount.setText(" " + count);
        }
    }


    public static void main(String[] args) {
        SCounter sc = new SCounter();
        sc.frame();
    }

    public void frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }
}
