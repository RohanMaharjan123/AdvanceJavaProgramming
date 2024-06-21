package QuestionNo2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class CustomDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Display");
        Dimension winSize = new Dimension(600, 400);

        frame.setTitle("My Custom GUI Program");
        frame.setSize(winSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // inserted color into the panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        // Added a label with a custom message
        JLabel label = new JLabel("Welcome to My Custom GUI!");
        panel.add(label);

        // Added the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
