package QuestionNo._1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Countpanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AWT Counter");
        JPanel mainPanel = new JPanel();

        JLabel lb1 = new JLabel("Enter an integer");
        JTextField tf1 = new JTextField(10);
        JButton bt1 = new JButton("Count Down");

        mainPanel.add(lb1);
        mainPanel.add(tf1);
        mainPanel.add(bt1);
        
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}