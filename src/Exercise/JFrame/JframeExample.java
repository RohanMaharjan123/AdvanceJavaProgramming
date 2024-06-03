package Exercise.JFrame;

import javax.swing.*;
// 1
public class JframeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("NCCS");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
