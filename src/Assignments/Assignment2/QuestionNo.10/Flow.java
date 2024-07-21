package QuestionNo._10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Demo");
        frame.setLayout(new FlowLayout());

        for (int i = 1; i <= 3; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}