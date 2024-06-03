package Exercise.JTextFieldExample;

import javax.swing.*;
// 3
public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello");

        // Create a label and a text field
        JLabel label = new JLabel("Hi");
        JTextField textField = new JTextField(20);

        // Add components to the frame
        frame.add(label);
        frame.add(textField);

        // Set frame properties
        frame.setSize(200, 300);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close the application when the frame is closed
        frame.setVisible(true);
    }
}
