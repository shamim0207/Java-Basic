import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Run!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);


        Label label = new Label();
        panel.add(label);

        JButton clickButton = new JButton("Click");
        panel.add(clickButton);

        clickButton.addActionListener(new ActionListener() {
            int count = 3;

            @Override
            public void actionPerformed(ActionEvent e) {
                counter();
            }

            public void counter() {
                if (count > 0) {
                    label.setText(count + "...");
                    count--;
                } else if (count ==0) {
                    label.setText("Go!");
                }
            }
        });

        frame.setVisible(true);
    }
}
