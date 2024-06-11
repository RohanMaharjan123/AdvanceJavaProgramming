package Lab._20240611._0;

import javax.swing.*;
import java.awt.*;

public class DisplayRedOval extends JFrame {
    public DisplayRedOval() {
        setTitle("Display Red Oval with Yellow Fill");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add the custom panel to draw the oval
        add(new OvalPanel());
    }

    // Custom JPanel to draw the red oval with yellow fill
    class OvalPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Set the color to yellow and fill the oval
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(100, 75, 200, 150);

            // Set the color to red and draw the oval outline
            g2d.setColor(Color.RED);
            g2d.drawOval(100, 75, 200, 150);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DisplayRedOval().setVisible(true);
            }
        });
    }
}
