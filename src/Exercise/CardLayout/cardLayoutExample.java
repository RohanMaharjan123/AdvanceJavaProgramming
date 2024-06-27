package CardLayout;

import javax.swing.*;
import java.awt.*;

public class cardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        card1.setBackground(Color.RED);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.setBackground(Color.GREEN);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        card3.setBackground(Color.BLUE);

        cardPanel.add(card1, "card1");
        cardPanel.add(card2, "card2");
        cardPanel.add(card3, "card3");

        // Adding buttons to switch between cards
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Show Card 1");
        JButton button2 = new JButton("Show Card 2");
        JButton button3 = new JButton("Show Card 3");

        button1.addActionListener(e -> cardLayout.show(cardPanel, "card1"));
        button2.addActionListener(e -> cardLayout.show(cardPanel, "card2"));
        button3.addActionListener(e -> cardLayout.show(cardPanel, "card3"));

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
