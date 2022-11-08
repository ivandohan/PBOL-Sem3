package GUI;

import javax.swing.*;
import java.awt.*;

public class HelloSekai extends JFrame {

    private JLabel label;
    public HelloSekai() {
        super("D. Ohann");
        setLayout(new FlowLayout());
        label = new JLabel("D. Ohann");
        label.setFont(new Font("San Serif", Font.PLAIN, 30));
        add(label);
    }

    public static void main(String[] args) {
        HelloSekai gui = new HelloSekai();

        gui.IOPopUp();
//        gui.frame();
    }

    public void frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
    }

    public void IOPopUp() {
        String str1 = JOptionPane.showInputDialog("? ");
        String str2 = JOptionPane.showInputDialog("?? ");

        JOptionPane.showMessageDialog(null, str1.concat(" " + str2));
    }
}
