package Exercise.JPanel;

import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // set drawing color to red
        g.setColor(Color.RED);

        // Draw a rectangle
        g.drawRect(20, 20, 100, 50);
        g.fillRect(20, 20, 100, 50);

        // Draw a filled Oval
        g.setColor(Color.BLUE);
        g.fillOval(150, 20, 80, 100);

        // Draw a line
        g.setColor(Color.BLACK);
        g.drawLine(50, 150, 200, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes");

        frame.setSize(300, 200);

        frame.add(new DrawShapes());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
