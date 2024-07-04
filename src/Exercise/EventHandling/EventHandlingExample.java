package Exercise.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Event Handling Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Creating a new button
        JButton button = new JButton("Click Me!");

        // Create a label to display the message
        JLabel label = new JLabel("Button not clicked", SwingConstants.CENTER);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event
                label.setText("Button clicked!");
            }
        });

        // Create a panel to hold the button and label
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility
        frame.setVisible(true);
    }
}