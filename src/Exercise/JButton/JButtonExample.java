package Exercise.JButton;

import javax.swing.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JButton Example");
        frame.setSize(500, 500);

        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        // Panel
        JPanel panel = new JPanel();
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}