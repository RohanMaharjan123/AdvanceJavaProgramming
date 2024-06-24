package FlowLayoutExample;

import javax.swing.*;

public class FlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setTitle("Jbutton Example");
        frame.setSize(400, 200);

        // Define new buttons
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        // Define the panel to hold buttons
        JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        // panel.setBackground(Color.LIGHT_GRAY);

        // Add buttons to the panel
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        // Add the panel to the frame
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
