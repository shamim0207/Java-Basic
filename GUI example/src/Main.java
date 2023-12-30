import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Run!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel with GridLayout (2 rows, 2 columns)
        JPanel panel = new JPanel(new GridLayout(2, 2));

        // Create buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // ActionListener for button clicks
        ActionListener rearrangeButtons = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove all buttons from the panel
                panel.removeAll();

                // Rearrange buttons based on the clicked button
                if (e.getSource() == button1) {
                    panel.add(button1);
                    panel.add(button2);
                    panel.add(button3);
                    panel.add(button4);
                } else if (e.getSource() == button4) {
                    panel.add(button1);
                    panel.add(button3);
                    panel.add(button2);
                    panel.add(button4);
                }

                // Repaint the panel to reflect changes
                panel.revalidate();
                panel.repaint();
            }
        };

        // Add ActionListener to buttons
        button1.addActionListener(rearrangeButtons);
        button4.addActionListener(rearrangeButtons);

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }
}