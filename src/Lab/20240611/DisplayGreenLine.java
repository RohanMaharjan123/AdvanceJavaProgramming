package Lab.20240611;

import javax.swing.*;
import java.awt.*;

public class DisplayGreenLine extends JFrame {
    public DisplayGreenLine() {
        setTitle("Display Green Line");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add panel to draw the green line
        add(new GreenLinePanel());
    }

    // JPanel to draw a green line
    class GreenLinePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.GREEN); // Set the color to green
            g.drawLine(50, 50, 350, 50); // Draw the green line
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DisplayGreenLine().setVisible(true);
            }
        });
    }
}
