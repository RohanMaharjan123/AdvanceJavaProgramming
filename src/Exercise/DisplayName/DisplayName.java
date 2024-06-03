package DisplayName;
import javax.swing.*;
// 4
public class DisplayName extends JFrame {
    public DisplayName() {
        setTitle("Display Name");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Corrected the typo here

        JLabel nameLabel = new JLabel("Rose");
        add(nameLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DisplayName().setVisible(true); // Corrected the class name here
            }
        });
    }
}
