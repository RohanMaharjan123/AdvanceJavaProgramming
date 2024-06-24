package FontExample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FontExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);
        frame.setLayout(new java.awt.GridBagLayout()); // Centering label in the frame

        JLabel label = new JLabel("NCCS College", SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        Font myFont = new Font("Serif", Font.BOLD | Font.ITALIC, 28);
        label.setFont(myFont);

        frame.add(label);
        frame.setVisible(true);
    }
}
